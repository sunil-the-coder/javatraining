package com.psl.example.client;

class Student {

	public int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class A {

	int a = 10;
	int b;

	A(int a) {
		this(a, 20);
	}

	A(int a, int b) {
		this.a = a;
		this.b = b;
	}

	A(String str) {

	}

	public void disp() {
		// a/b
	}

}

class B extends A {
	int c;

	public B(int a, int b, int c) {
		// super("ABC");
		super(a, b);
		this.c = c;
	}

	public B(int c) {
		this(10, 20, 30);
	}

	public void disp() {
		super.disp();
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new A(10);
		
		
	}
}
