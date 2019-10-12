package com.itp.oshop.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// 1. load configuration into memory

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// 2. Build session factory from configuration.
		return config.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
