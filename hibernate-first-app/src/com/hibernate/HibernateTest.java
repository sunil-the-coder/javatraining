package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Person;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		// 3. Obtain new session for any operation from sessionFactory
		Session session = sessionFactory.openSession();

		// 4. Insert/Update/Delete - Start the transaction
		Transaction tx = session.beginTransaction();

		// 5. Save the object
//		Person p1 = new Person("Mandal", "902692");
//		Person p2 = new Person("Akshay", "2425");
//		Person p3 = new Person("Swapnil", "29602");
//		
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		
		
		//select *from person where id =2;
		Person person = (Person)session.get(Person.class, 100);
		//Person person = (Person)session.get(Person.class, 2);
		System.out.println(person.getId());
		
		//person = (Person)session.load(Person.class, 2);
		//System.out.println(person.getId());
		
		tx.commit();

	//	System.out.println("Person information is Updated.");

		session.close();

		sessionFactory.close();
	}

}
