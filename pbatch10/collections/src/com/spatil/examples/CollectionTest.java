package com.spatil.examples;

import java.util.ArrayList;
import java.util.List;

class Student {

}

public class CollectionTest {

	public static int getSum(List<Integer> list) {
		int total = 0;
		
		for(Integer element : list) {
			total = total + element;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int total = getSum(list);
		
		System.out.println("Total is:"+total);
		
	}
}






