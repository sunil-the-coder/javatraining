package com.itp.training;

import java.util.LinkedHashSet;
import java.util.Set;

class A {
	@Override
	public String toString() {
		return "A Obj";
	}
}

public class Application {

	public static void main(String[] args) {

		Set c = new LinkedHashSet();
		c.add(10);
		c.add("SUNIL");
		c.add(10.5);
		c.add(new A());
		c.add("BLUE");
		c.add("BLUE");
		c.add("BLUE");
		c.add("BLUE");
		c.add("BLUE");
		c.add("BLUE");
		c.add("BLUE");
		
		System.out.println("Size:" + c.size());
		System.out.println(c);

	}
}
