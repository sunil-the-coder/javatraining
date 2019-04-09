package com.psl.example.client;

import java.util.Scanner;

class Student {

	private int id;
	private String name;
	private static int data;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addData() {
		data += 2;
	}

	public void disp() {
		System.out.println("ID:" + id + ",Name:" + name + ",Data:" + data);
	}
}

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(10,"sunil");
		s1.addData();
		s1.disp();
		
		Student s2 = new Student(11,"anil");
		s2.addData();
		s2.disp();
		
		Student s3 = new Student(12,"ganesh");
		s3.addData();
		s3.disp();
		
		
	}
}
