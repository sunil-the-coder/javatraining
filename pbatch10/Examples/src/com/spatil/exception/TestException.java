package com.spatil.exception;

public class TestException {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");

		try {

			int ans = 10 / 0;
			System.out.println("Ans is:" + ans);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		// f1();

		System.out.println("3");
		System.out.println("5");
		System.out.println("6");
	}

	private static void f1() {
		f2();
	}

	private static void f2() {

		try {

			int ans = 10 / 0;
			System.out.println("Ans is:" + ans);

		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());

			// System.out.println("Please provide non-zero numerator value. Can't divide by
			// zero");
		}
	}
}
