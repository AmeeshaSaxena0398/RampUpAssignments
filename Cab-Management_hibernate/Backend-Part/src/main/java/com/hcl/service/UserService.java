package com.hcl.service;

import com.hcl.model.User;

public interface UserService {
	
	public abstract void createUser(User user);
	public abstract User getUserbyId(long userId);
	public abstract void updateUserById(long userId ,String newpanId);
	public abstract void deleteUserById( long userId);
	
	

}
