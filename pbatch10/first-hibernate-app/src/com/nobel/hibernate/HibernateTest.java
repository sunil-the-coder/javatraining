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

		Person stud = new Person("Akash", "5252626");
		Vehicle veh = new Vehicle("Unicorn");

		stud.setVehicle(veh);
		
		session.save(stud);
		session.save(veh);

		session.getTransaction().commit();

		System.out.println("Student Saved.");

		session.close();
		HibernateUtil.shutdown();
	}
}
