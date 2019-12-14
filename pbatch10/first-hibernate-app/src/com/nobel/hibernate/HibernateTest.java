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
		
		//Query query = session.createQuery("select OBJECT(s) from Student s where phone=?");
		//query.setString(0, "2785925");
		
		//Named Parameters Binding
		//Query query = session.createQuery("select OBJECT(s) from Student s where phone=:contact");
		//query.setParameter("contact", args[0]);
		
		Query query = session.createQuery("select name,phone from Student s where phone=:myContact");
		query.setParameter("myContact", "2785925");
		
		
		List<Object[]> students = (List<Object[]>) query.list();
		for(Object[] stud : students)
			System.out.println(stud[0]+"\t"+stud[1]);
		
		
		
		
		session.close();

		HibernateUtil.shutdown();
	}
}
