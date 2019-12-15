package com.nobel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Address;
import com.nobel.hibernate.model.Person;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Address homeAddr = new Address(411033, "wakad", "datta mandir", "pune");
		Address officeAddr = new Address(411055, "Kharadi", "Aiport", "pune");

		Person stud = new Person("Akash", "5252626");
		stud.getAddresses().add(homeAddr);
		stud.getAddresses().add(officeAddr);

		session.save(stud);

		session.getTransaction().commit();

		System.out.println("Student Saved.");

		session.close();
		HibernateUtil.shutdown();
	}
}
