package com.itp.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(10, "ABC");
		map.put(11, "PQR");
		map.put(12, "XYZ");

		System.out.println(map);

		map.forEach((k, v) -> System.out.println(k + "|" + v));

		System.out.println("----------------------------------");
		Collection<String> values = map.values();
		for (String s : values)
			System.out.println(s);

		System.out.println("-------------------------------------");
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key);
		}

		System.out.println("------------------------------------");
		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> entryItr = entries.iterator();
		while (entryItr.hasNext()) {
			Map.Entry<Integer, String> entry = entryItr.next();
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}

	}
}
