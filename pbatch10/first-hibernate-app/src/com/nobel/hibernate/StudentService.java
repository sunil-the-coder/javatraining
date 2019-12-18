package com.nobel.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.hibernate.model.Person;
import com.nobel.hibernate.util.HibernateUtil;

public class StudentService {

	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Person getStudentById(int id) {
		Session session = sessionFactory.openSession();
		Person stud = (Person) session.get(Person.class, id);
		session.close();
		return stud;
	}

	public List<Person> getAllStudents() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Student");
		List<Person> students = (List<Person>) query.list();
		session.close();
		return students;
	}

	public boolean deleteStudentById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Person stud = new Person();
		stud.setId(id);
		session.delete(stud);
		session.close();

		return true;
	}
}
