package com.psl.example.client;

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

	public String toString() {
		return "ID:" + id + ",Name:" + name + ",Data:" + data;
	}
}

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student(10,"sunil");
		s1.addData();
		System.out.println(s1.toString());
		
		Student s2 = new Student(11,"anil");
		s2.addData();
		System.out.println(s2);
		
		
		Student s3 = new Student(12,"ganesh");
		s3.addData();
		System.out.println(s3);
		
		
	}
}
