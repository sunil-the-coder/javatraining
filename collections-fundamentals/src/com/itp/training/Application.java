package com.itp.training;

import java.util.HashMap;
import java.util.Map;

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
		if (this == obj)
			return true;
		if (obj != null && obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.id && this.name.equals(s.name) ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		//prime numbers
		int sHash =name.hashCode();
		return id + sHash;
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

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap();

		map.put(null, 100);
		map.put(new Student(3, "ANIL", 25), 200);
		Integer oldValue = map.put(new Student(3, "GANESH", 23), 300);

		System.out.println("Old value:"+oldValue);
		//System.out.println(map);
		
		System.out.println(map.get(new Student(3, "ANIL", 25)));

	}
}
