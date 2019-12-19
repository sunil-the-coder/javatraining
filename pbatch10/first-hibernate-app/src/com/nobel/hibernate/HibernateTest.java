package com.nobel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Employee;
import com.nobel.hibernate.model.Person;
import com.nobel.hibernate.model.SalesPerson;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Person person = (Person) session.get(Person.class, 1);
		System.out.println(person);

		Person person2 = (Person) session.get(Person.class, 1);
		System.out.println(person2);
		
		Person person3 = (Person) session.get(Person.class, 2);
		System.out.println(person3);
		
		session.close();
		
		Session session2 = sessionFactory.openSession();
		
		Person person4 = (Person) session2.get(Person.class, 1);
		System.out.println(person4);
		
		session2.close();

		
		HibernateUtil.shutdown();
	}
}
