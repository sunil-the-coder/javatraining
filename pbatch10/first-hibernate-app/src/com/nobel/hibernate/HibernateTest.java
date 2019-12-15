package com.nobel.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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

		Criteria criteria = session.createCriteria(Student.class); //from Student
	//	criteria.add(Restrictions.like("phone", "%26"));
	//	criteria.add(Restrictions.like("name", "p%"));
		criteria.addOrder(Order.desc("name"));
	//	criteria.add(Restrictions.between("publishedDate",d1 , d2));
		
		//Restrictions.
		
		List<Student> students = (List<Student>)criteria.list();
		for(Student stud : students)
			System.out.println(stud);
		
		
		session.close();
		HibernateUtil.shutdown();
	}
}
