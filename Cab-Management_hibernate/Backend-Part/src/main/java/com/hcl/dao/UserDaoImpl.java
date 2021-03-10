package com.hcl.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hcl.model.User;
import com.hcl.util.HibernateUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public void addUser(User user) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			Long userid =(Long)session.save(user);
			System.out.println("User is created  with Id::"+userid);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public User fetchUserbyId(long userId) {
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			 user = session.get(User.class, userId );
			if(user != null){
				return user;
			}else{
				System.out.println("User doesn't exist with provided Id..");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void updateUserById(long userId, String newpanId) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			User user = session.get(User.class, userId);
			if(user != null){
				user.setUserPAN(newpanId);
				session.beginTransaction();
				session.update(user);
				session.getTransaction().commit();
			}else{
				System.out.println("User doesn't exist with provided Id..");
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUserById(Long userId) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			User user = session.get(User.class, userId);
			if(user != null){
				session.beginTransaction();

				session.delete(user);
				session.getTransaction().commit();
			}else{
				System.out.println("User doesn't exist with provided Id..");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}
		
	}
	


