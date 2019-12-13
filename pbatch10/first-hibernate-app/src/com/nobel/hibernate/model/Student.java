package com.nobel.hibernate.model;

public class Student {

	private int studentId;
	private String name;
	private String phone;

	public Student() {
	}

	public Student(int studentId, String name, String phone) {
		super();
		this.studentId = studentId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
