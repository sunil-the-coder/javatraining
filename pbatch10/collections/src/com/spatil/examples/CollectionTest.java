package com.spatil.examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student {

}

public class CollectionTest {

	public static void main(String[] args) {

		List list = new LinkedList();
		list.add(10);
		list.add(10.5);
		list.add("sunil");

		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		
		for(Object obj : list)
			System.out.println(obj);
		
		System.out.println("********** Using iterator *************");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
	}
}
