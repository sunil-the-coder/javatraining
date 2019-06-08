package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Person;
import com.hibernate.model.Vehicle;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Person person = new Person("Komal","526262");
		Vehicle vehicle = new Vehicle("Jupiter");

		//one-to-one mapping
		person.setVehicle(vehicle);
		
		session.save(vehicle);
		session.save(person);
		
		session.getTransaction().commit();	

		//SQL Query
		Query query = session.createQuery("from Person");
		List<Person> persons = (List<Person>)query.list();
		
		if(persons != null && persons.size() >= 1) {
			persons.stream().forEach(p->System.out.println(p));
		}
	
		
		session.close();
		sessionFactory.close();
	}

}
