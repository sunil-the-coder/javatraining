package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Employee;
import com.hibernate.model.Person;
import com.hibernate.model.SalesPerson;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		//Transient statue
		Person person = new Person("Komal","526262");
		Employee employee = new Employee("Mandal","8206820",50000);
		SalesPerson sp = new SalesPerson("Prakash","8290626",5000);
		
		
		session.save(person);
		session.save(employee);
		session.save(sp);
		
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
