package com.hcl.service;

import com.hcl.dao.UserDaoImpl;
import com.hcl.model.User;

public class UserServiceImpl implements UserService{

	@Override
	public void createUser(User user) {
		new UserDaoImpl().addUser(user);
		
		
	}

	@Override
	public User getUserbyId(long userId) {
		
		return new UserDaoImpl().fetchUserbyId(userId);
	}

	@Override
	public void updateUserById(long userId, String newpanId) {
		new UserDaoImpl().updateUserById(userId, newpanId);
		
	}

	

	@Override
	public void deleteUserById(long userId) {
		new UserDaoImpl().deleteUserById(userId);
		
	}

}
