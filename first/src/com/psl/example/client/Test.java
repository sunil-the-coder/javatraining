package com.psl.example.client;

import java.util.Scanner;

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
		
		
		Student s = new Student();
		Student s = new Student();
		Student s = new Student();
		Student s = new Student();
		
		
		
		
		int count = dispObjectCount();
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		String name = scan.nextLine();
		
		
		//Array of objects
		Student[] studs = new Student[5];
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new Student(i+1,"A"+i);
			studs[i].disp();
		}
		
	}
}
