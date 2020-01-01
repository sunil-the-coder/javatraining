package com.nobel.oshop.handler;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebListener
public class ApplicationHandler implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Closing sessionFactory object");
		ServletContext context = sce.getServletContext();
		SessionFactory sessionFactory = (SessionFactory) context.getAttribute("sessionFactory");
		if (sessionFactory != null) {
			sessionFactory.close();
			context.removeAttribute("sessionFactory");
		}
		
		System.out.println("sessionFactory object is closed.");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInit called....");
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

		ServletContext context = sce.getServletContext();
		context.setAttribute("sessionFactory", sessionFactory);

		System.out.println("Hibernate initialized with sessionFactory.");
	}

}
