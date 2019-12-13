package com.nobel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nobel.hibernate.model.Student;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();		
		
		Session session = sessionFactory.openSession();

		Transaction txn = session.beginTransaction();

		Student stud = new Student("Satish", "9844564323");
		session.save(stud);

		txn.commit();

		System.out.println("Student Object is Saved.");

		session.close();

		
		HibernateUtil.shutdown();
	}
}
