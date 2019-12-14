package com.nobel.hibernate;

import com.nobel.hibernate.model.Student;
import com.nobel.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(4);
		System.out.println(student);
		
		for(Student stud: studentService.getAllStudents())
			System.out.println(stud);
		
		HibernateUtil.shutdown();
	}
}
