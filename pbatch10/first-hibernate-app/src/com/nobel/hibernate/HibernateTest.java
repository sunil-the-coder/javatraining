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

		session.beginTransaction();

		Person person1 = new Person("Akash", "52905210");
		Employee emp1 = new Employee("Pradip", "5252626", 50000);
		SalesPerson sp1 = new SalesPerson("Mandal", "909205", 40000);
		SalesPerson sp2 = new SalesPerson("Raju", "920525", 60000);
		
		session.save(person1);
		session.save(emp1);
		session.save(sp1);
		session.save(sp2);
		
		session.getTransaction().commit();

		System.out.println("Person Saved.");

		session.close();
		HibernateUtil.shutdown();
	}
}
