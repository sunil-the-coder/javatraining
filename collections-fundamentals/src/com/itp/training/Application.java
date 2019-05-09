package com.itp.training;

import java.util.Collection;
import java.util.LinkedList;

class A {
	@Override
	public String toString() {
		return "A Obj";
	}
}

public class Application {

	public static void main(String[] args) {

		Collection c = new LinkedList();
		c.add(10);
		c.add("SUNIL");
		c.add(10.5);
		c.add(new A());
		c.add("BLUE");

		System.out.println(c);

		c.remove("SUNIL");
		System.out.println(c);

		System.out.println("Size:" + c.size());

		Collection c1 = new LinkedList();
		c1.add("BLUE");
		c1.add("ORANGE");

		c.addAll(c1);
		System.out.println(c);

		System.out.println("Contains:" + c.contains("BLUE"));

		System.out.println("ContainsAll:" + c.containsAll(c1));

		// delete all elements from collection
//		c.clear();
//		System.out.println("Size:"+c.size());

		System.out.println("isEmpty:" + c.isEmpty());
		// c.removeAll(c1);

		System.out.println(c);

		// c.removeIf(f->f)

		// c.retainAll(c1);
		System.out.println(c);

		Object[] data = c.toArray();

		//java 8 - forEach loop with lambda
		c.forEach(e -> System.out.println(e));

	}
}






