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
		c.add(10);
		c.add(10);
		c.add(5);
		c.add(4);

		System.out.println("Size:" + c.size());
		System.out.println(c);

	}
}
