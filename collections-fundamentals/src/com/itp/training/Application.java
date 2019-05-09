package com.itp.training;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class Application {

	public static void main(String[] args) {

		NavigableSet c = new TreeSet();
		c.add("SUNIL");
		c.add("ANIL");
		c.add("GANESH");
		c.add("ARYAN");
		c.add("SHIVANSH");
		c.add("MAULI");
		
		Set headSet = c.headSet("GANESH");
		Set tailSet = c.tailSet("GANESH");
		Set subSet = c.subSet("GANESH", "SHIVANSH");
		
		System.out.println(headSet);
		System.out.println(tailSet);
		System.out.println(subSet);
		
	}
}
