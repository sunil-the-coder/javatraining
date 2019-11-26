package com.spatil.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {

		Set<Integer> set =  new LinkedHashSet<>();
		set.add(50);
		set.add(10);
		set.add(15);
		set.add(5);
		set.add(50);
		set.add(100);
		set.add(5);
		
		System.out.println(set);

	}
}
