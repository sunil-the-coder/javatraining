package com.itp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.spring.dao.UserDao;
import com.itp.spring.model.User;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		UserDao userDao = context.getBean("userDao", UserDao.class);

		User user = new User(6, "test12", "test12");
		userDao.saveUser(user);

		/*
		 * for (User user : userDao.getAllUsers()) { System.out.println(user); }
		 */

	}
}
