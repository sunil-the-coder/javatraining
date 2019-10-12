package com.itp.spring.dao;

import java.util.List;

import com.itp.spring.model.User;

public interface UserDao {

	void saveUser(User user);
	
	List<User> getAllUsers();
}
