package com.nobel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Person;
import com.nobel.hibernate.model.Vehicle;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Person person = new Person("Akash", "5252626");
		Vehicle veh1 = new Vehicle("Unicorn");
		Vehicle veh2 = new Vehicle("BMW");
		
		//Most Imp Step - Bidirection 
		
		person.getVehicles().add(veh1);
		person.getVehicles().add(veh2);

		veh1.setPerson(person);
		veh2.setPerson(person);
		
		session.save(veh1);
		session.save(veh2);
		
		session.save(person);

		session.getTransaction().commit();

		System.out.println("Person Saved.");

		session.close();
		HibernateUtil.shutdown();
	}
}
