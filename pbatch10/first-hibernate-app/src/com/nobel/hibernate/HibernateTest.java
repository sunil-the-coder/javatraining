package com.nobel.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Student;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		/*
		 * StudentService studentService = new StudentService(); Student student =
		 * studentService.getStudentById(4); System.out.println(student);
		 * 
		 * for(Student stud: studentService.getAllStudents()) System.out.println(stud);
		 */

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.getNamedQuery("fetchAllStudents");
		for(Object obj :  query.list()) {
			System.out.println((Student)obj);
		}
		
		
		session.close();
		HibernateUtil.shutdown();
	}
}
