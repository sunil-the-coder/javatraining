package com.spatil.examples;

import java.util.ArrayList;
import java.util.List;

//User defined generic class
class Student<T> {
	T id;

	public Student(T id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}

public class CollectionTest {

	public static int getSum(List<Integer> list) {
		int total = 0;

		for (Integer element : list) {
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

		System.out.println("Total is:" + total);

		
		Student<Integer> stud = new Student<>(10);
		System.out.println(stud);
		
		Student<String> stud2 = new Student<>("52525");
		System.out.println(stud2);
		
		
	}
}
