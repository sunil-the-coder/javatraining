package com.itp.training;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.id && this.name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Student s2) {
		// this ->current object, s2 -> second object.
		int res = this.id - s2.id;
		if(res == 0) {
			return this.name.compareTo(s2.name);
		}
		
		return res;
		
		/*
		 * if (this.id > s2.id) return -1;// ASC else if(this.id < s2.id) return 1;
		 * //DESC return 0;
		 * 
		 * return this.name.compareTo(s2.name);
		 */	}

}

public class Application {

	public static int getSum(List<Integer> numbers) {
		int total = 0;
		for (Integer data : numbers) {
			total += data;
		}
		return total;
	}

	public static void main(String[] args) {

		SortedSet<String> names = new TreeSet();
		names.add("SUNIL");
		names.add("ANIL");
		names.add("GANESH");

		SortedSet<Integer> numbers = new TreeSet();
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);

		SortedSet<Student> students = new TreeSet();
		students.add(new Student(12, "SUNIL"));
		students.add(new Student(11, "ANIL"));
		students.add(new Student(10, "GANESH"));
		students.add(new Student(12, "AKSHAY"));
		
		// new Student(12,"SUNIL").compareTo(new Student(11,"ANIL"))

		System.out.println(names);
		System.out.println(numbers);
		System.out.println(students);

		/*
		 * List<Integer> numbers = new ArrayList();
		 * 
		 * numbers.add(10); numbers.add(20); numbers.add(30);
		 * 
		 * int total = getSum(numbers);
		 * 
		 * System.out.println("Total:"+total);
		 */

		/*
		 * List students = new ArrayList();
		 * 
		 * students.add(new Student(10, "SUNIL")); students.add(new Student(11,
		 * "ANIL")); students.add(new Student(12, "GANESH"));
		 * 
		 * // students.remove(1); students.remove(new Student(12, "GANESH"));
		 * 
		 * students.forEach((e) -> System.out.println(e));
		 * 
		 * List names = new ArrayList();
		 * 
		 * names.add("SUNIL"); names.add("ANIL"); names.add("GANESH");
		 * 
		 * names.remove("ANIL");
		 * 
		 * System.out.println(names);
		 * 
		 */
		/*
		 * String s = "ANIL"; if("ANIL".equals("ANIL")) { System.out.println("Equal");
		 * }else System.out.println("Not Equals");
		 */

		/*
		 * Map nameMap = new TreeMap();
		 * 
		 * nameMap.put(10, "SUNIL"); nameMap.put(20, "ANIL"); nameMap.put(19,
		 * "SHIVANSH"); nameMap.put(23, "GANESH"); nameMap.put(14, "MAULI");
		 * nameMap.put(15,null); nameMap.put(16,null); //nameMap.put(null,"AKASH");
		 * //nameMap.put(null,"AKSHAY"); nameMap.put(14, "MANDAL");
		 * 
		 * 
		 * nameMap.forEach((k, v) -> System.out.println(k + "|"+v));
		 * 
		 * // System.out.println(nameMap);
		 * 
		 * Object obj = nameMap.get(12); System.out.println(obj);
		 * 
		 * System.out.println("20->"+nameMap.get(20));
		 * 
		 * System.out.println("20->"+nameMap.getOrDefault(20, "SATISH"));
		 */

	}
}
