package com.nobel.oshop.servlets;

import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * This servlet will be called automatically when app starts & it creates
 * sessionFactory of hibernate.
 */
//@WebServlet(loadOnStartup = 1)
public class InitializeHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		System.out.println("Initializing hibernate for sessionFactory....");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		Configuration hibernateConfig = new Configuration();
		hibernateConfig.configure("hibernate.cfg.xml");

		// 2. Create sessionFactory object
		SessionFactory sessionFactory = hibernateConfig.buildSessionFactory();

		ServletContext context = getServletContext();
		context.setAttribute("sessionFactory", sessionFactory);

		System.out.println("Hibernate initialized with sessionFactory.");

	}

}
