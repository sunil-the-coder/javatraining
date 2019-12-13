package com.nobel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nobel.hibernate.model.Student;

public class HibernateTest {

	public static void main(String[] args) {

		//Step by Step loading of hibernate
		
		//1. Load the configuration file.
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		//2. Create sessionFactory object
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//3. Open new session for any kind of operation with database.
		Session session = sessionFactory.openSession();
		
		//4. Start the transaction
		Transaction txn = session.beginTransaction();
		
		//4. Perform Your operation
		Student stud = new Student(1, "Sunil", "82962896");
		
		session.save(stud);
		
		txn.commit();
		
		System.out.println("Student Object is Saved.");
		
		//5. Close the session & sessionFactory objects.
		session.close();
		
		//Most Imp Step.
		sessionFactory.close();
	}
}
