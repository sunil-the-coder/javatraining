package com.psl.example.client;

public class Test {

	public static void f2() {
		System.out.println("f2()");
	}

	public static void f1() {
		f2();
	}

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");

		try {
			int ans = 10 / 0;
			System.out.println("Ans is:" + ans);
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Divider must not be zero.");
		}
		System.out.println("3");
		System.out.println("4");
	}
}
