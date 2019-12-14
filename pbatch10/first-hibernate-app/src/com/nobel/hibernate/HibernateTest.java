package com.nobel.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Student;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		//select * from student
		//Query query = session.createQuery("from Student");
		
		Query query = session.createQuery("select OBJECT(s) from Student s");
		
		List<Student> students = (List<Student>) query.list();
		for(Student stud : students)
			System.out.println(stud);
		
		
		
		
		session.close();

		HibernateUtil.shutdown();
	}
}
