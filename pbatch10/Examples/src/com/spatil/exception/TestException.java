package com.spatil.exception;

import java.io.IOException;

public class TestException {

	public static void main(String[] args) {
		
		try {
			f1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void f1() throws IOException {

		f2();
		
	}

	private static void f2() throws IOException  {
		System.in.read();
	}
}
