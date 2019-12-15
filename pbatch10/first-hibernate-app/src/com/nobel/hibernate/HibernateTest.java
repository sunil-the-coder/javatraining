package com.nobel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Address;
import com.nobel.hibernate.model.Student;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		Address homeAddr = new Address(411033, "wakad", "datta mandir", "pune");

		Student stud = new Student("Akash", "5252626");
		stud.setAddress(homeAddr);
		
		session.save(stud);
		
		session.getTransaction().commit();
		
		System.out.println("Student Saved.");

		session.close();
		HibernateUtil.shutdown();
	}
}
