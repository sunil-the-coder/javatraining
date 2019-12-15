package com.nobel.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="student")
@NamedQueries(value = {
		@NamedQuery(name = "getAllStudents",query = "from Student"),
		@NamedQuery(name = "getStudInfo",query = "select name,phone from Student"),
})
@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "fetchAllStudents",query = "select * from student",resultClass = Student.class)
})
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	private String name;
	
	@Column(name="contact")
	private String phone;

	public Student() {
	}

	public Student(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//@Column(name="contact")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", phone=" + phone + "]";
	}
	
	

}
