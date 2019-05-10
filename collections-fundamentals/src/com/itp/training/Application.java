package com.itp.training;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
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
		return this.id - s2.id;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

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


	
		/*
		 * class NameComparator implements Comparator<Student> {
		 * 
		 * @Override public int compare(Student s1, Student s2) { return
		 * s1.getName().compareTo(s2.getName()); } }
		 */
		
		
		SortedSet<String> names = new TreeSet();
		names.add("SUNIL");
		names.add("ANIL");
		names.add("GANESH");

		SortedSet<Integer> numbers = new TreeSet();
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);

		/*
		 * SortedSet<Student> students = new TreeSet(); students.add(new Student(12,
		 * "SUNIL")); students.add(new Student(11, "ANIL")); students.add(new
		 * Student(10, "GANESH")); students.add(new Student(13, "AKSHAY"));
		 */
		// new Student(12,"SUNIL").compareTo(new Student(11,"ANIL"))

		System.out.println(names);
		System.out.println(numbers);
		// System.out.println(students);

		List<Student> students = new LinkedList();
		students.add(new Student(12, "SUNIL", 25));
		students.add(new Student(11, "ANIL", 32));
		students.add(new Student(10, "GANESH", 24));
		students.add(new Student(13, "AKSHAY", 26));

		List<String> studNames = new LinkedList();//Arrays.asList("SUNIL", "GANESH", "SATISH");
		studNames.add("SUNIL");
		studNames.add("GANESH");
		studNames.add("SATISH");
		
		Iterator<String> itr = studNames.iterator();
		while(itr.hasNext()) {
			//return actual element
			String data = itr.next();
			if(data.equals("GANESH"))
				itr.remove(); //Remove current element from list collection.
		}
		
		
		
		Collections.sort(studNames);

		System.out.println(studNames);

		// It uses student class compareTo method for default sorting
		Collections.sort(students);

		System.out.println("After sorting by ID - Natural Order:");
		
		students.forEach(s -> System.out.println(s));

		//Functional Programming using lambda expression
		Collections.sort(students, (s1,s2) -> 
			s1.getAge() - s2.getAge());

		System.out.println("After sorting by Age:");
		
		students.forEach(s -> System.out.println(s));
		
		/*
		 * Collections.sort(students, new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o1.getName().compareTo(o2.getName()); } });
		 */

		Collections.sort(students, (o1,o2)-> 
			o1.getName().compareTo(o2.getName()));
		
		System.out.println("After sorting by Name:");
		
		students.forEach(s -> System.out.println(s));

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
