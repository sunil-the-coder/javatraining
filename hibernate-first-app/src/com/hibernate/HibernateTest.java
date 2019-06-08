package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Address;
import com.hibernate.model.Person;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Person person = new Person("Komal","526262");
		person.getAddresses().add(new Address("dange chowk", 413033, "pune"));
		person.getAddresses().add(new Address("kharadi", 413032, "Wagholi"));
		
		session.save(person);
	
		session.getTransaction().commit();	

		//SQL Query
		Query query = session.getNamedQuery("getAllPersons");
		List<Person> persons = (List<Person>)query.list();
		
		if(persons != null && persons.size() >= 1) {
			persons.stream().forEach(p->System.out.println(p));
		}
	
		
		session.close();
		sessionFactory.close();
	}

}
