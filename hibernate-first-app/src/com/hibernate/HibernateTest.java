package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Person;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Person p = (Person)session.get(Person.class, 1);
		System.out.println(p);
		
		p = (Person)session.get(Person.class, 1);
		System.out.println(p);
	
		p = (Person)session.get(Person.class, 1);
		System.out.println(p);
		
		session.close();

		
		Session session2 = sessionFactory.openSession();
		
		p = (Person)session2.get(Person.class, 1);
		System.out.println(p);
		
		session2.close();
		
		sessionFactory.close();
	}

}
