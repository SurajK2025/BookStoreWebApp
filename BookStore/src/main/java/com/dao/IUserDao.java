package com.dao;

import com.model.User;

public interface IUserDao {
	
	public boolean validateUser(User user);
	
	public void insertUser(User user);
}