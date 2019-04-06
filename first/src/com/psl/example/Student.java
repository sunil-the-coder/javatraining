package com.psl.example;

public class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void disp() {
		System.out.println("ID:" + id + ",Name:" + name);
	}
}
