package com.psl.example.client;

//import com.psl.example.Student;

class Student {

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

public class Test {

	public static void main(String[] args) {
		
		//Array of objects
		Student[] studs = new Student[5];
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new Student(i+1,"A"+i);
			studs[i].disp();
		}
		
	}
}
