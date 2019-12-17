package com.nobel.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nobel.hibernate.model.Person;
import com.nobel.hibernate.model.Vehicle;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		// 1. Load the configuration file.
		Configuration config = new Configuration();
		config.addAnnotatedClass(Person.class);
		config.addAnnotatedClass(Vehicle.class);
		
		config.setProperty("connection.driver_name", "com.mysql.cj.jdbc.Driver");
		config.setProperty("connection.url", "jdbc:mysql://localhost:3306/pbatch10");
		config.setProperty("connection.username", "sunil");
		config.setProperty("connection.password", "sunil@123");
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		config.setProperty("hibernate.hbm2ddl.auto", "create");
		config.setProperty("hibernate.show_sql", "true");
		
		config.configure();

		// 2. Create sessionFactory object
		SessionFactory sessionFactory = config.buildSessionFactory();

		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null)
			sessionFactory.close();
	}
}
