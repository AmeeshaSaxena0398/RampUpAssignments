package com.hcl.dao;

import com.hcl.model.User;

public interface UserDao {
	
	public abstract void addUser(User user);
	public abstract User fetchUserbyId(long userId);
	public abstract void updateUserById(long userId ,String newpanId);
	public abstract void deleteUserById(Long userId);

}
