package com.nobel.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Student;
import com.nobel.hibernate.util.HibernateUtil;

public class StudentService {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Student getStudentById(int id) {
		Session session = sessionFactory.openSession();
		Student stud = (Student) session.get(Student.class, id);
		session.close();
		return stud;
	}

	public List<Student> getAllStudents() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Student");
		List<Student> students = (List<Student>) query.list();
		session.close();
		return students;
	}

	public boolean deleteStudentById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student stud = new Student();
		stud.setStudentId(id);
		session.delete(stud);
		session.close();

		return true;
	}
}
