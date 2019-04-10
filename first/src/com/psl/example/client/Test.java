package com.psl.example.client;

import java.util.Scanner;

class Student {

	public int id;
	private String name;
	private static int data;

	public Student() {
	}

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

class A {
	
	int a = 10;
	static int b;

	// init block
	{
		System.out.println("init block 1");
		a = 100;
	}

	{
		System.out.println("init block 2");
		a = 200;
	}
	
	// constructor
	A(int a) {
		System.out.println("ctr 1");
		this.a = a;
	}

	static {
		System.out.println("static block 1");
		b = 200;
	}
	
	static {
		System.out.println("static block 2");
		b = 500;
	}
	
	public static void main(String[] args) {
		System.out.println("main called..");
	}

}

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String d = scan.nextLine();
		
		//Retrieve char from given location in string.
		char ch = d.charAt(0);
		System.out.println(ch);
		
		Character i1 = 'a';
		Character i2 = 'a';
		
		System.out.println(i1==i2);	
			
		//3 objects - a,b,ab
		String str = "a" + "b";
		System.out.println(str);
		
		
	}
}
