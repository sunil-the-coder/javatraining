package com.itp.training;

import java.util.Set;
import java.util.TreeSet;

class A {
	@Override
	public String toString() {
		return "A Obj";
	}
}

public class Application {

	public static void main(String[] args) {

		Set c = new TreeSet();
		c.add("SUNIL");
		c.add("ANIL");
		c.add("GANESH");
		c.add("ARYAN");

		System.out.println("Size:" + c.size());
		System.out.println(c);

	}
}
