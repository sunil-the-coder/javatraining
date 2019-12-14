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
		
		Student stud = (Student) session.get(Student.class, 1);
		
		System.out.println(stud);

		session.delete(stud);

		txn.commit();

		session.close();

		
		HibernateUtil.shutdown();
	}
}
