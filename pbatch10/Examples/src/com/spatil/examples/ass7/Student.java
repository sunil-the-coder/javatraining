package com.spatil.examples.ass7;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private Date dob;
	private int[] marks = new int[3];

	public Student(int id, String name, Date dob,int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob.toString() + ", marks=" + Arrays.toString(marks) + "]";
	}

}
