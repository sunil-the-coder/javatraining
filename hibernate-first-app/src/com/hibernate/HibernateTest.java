package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Student;

public class HibernateTest {

	public static void main(String[] args) {

		// 1. load configuration into memory

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// 2. Build session factory from configuration.
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 3. Obtain new session for any operation from sessionFactory
		Session session = sessionFactory.openSession();

		// 4. Insert/Update/Delete - Start the transaction
		Transaction tx = session.beginTransaction();

		// 5. Save the object
		Student student = new Student(100, "Mandal", "902692");

		session.save(student);

		tx.commit();

		System.out.println("Student information is Updated.");

		session.close();

		sessionFactory.close();
	}

}
