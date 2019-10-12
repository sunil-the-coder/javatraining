package com.psl.example;

public class Student {

	private int id;
	private String name;
	private String contact;
	private Date dob;

	public Student(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public Student(int id, String name, String contact, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.dob = dob;
	}

	public void setDate(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", dob=" + dob + "]";
	}

}
