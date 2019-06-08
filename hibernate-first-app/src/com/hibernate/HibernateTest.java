package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Person;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.getNamedQuery("allPersons");
		List<Person> persons = (List<Person>)query.list();
		
		if(persons != null && persons.size() >= 1) {
			persons.stream().forEach(p->System.out.println(p));
		}
	
		System.out.println("-------------------------------------");
		query = session.getNamedQuery("personsByMobile");
		query.setParameter("mobile", "29602");
		
		persons = (List<Person>)query.list();
		if(persons != null && persons.size() >= 1) {
			persons.stream().forEach(p->System.out.println(p));
		}

		
		session.close();
		sessionFactory.close();
	}

}
