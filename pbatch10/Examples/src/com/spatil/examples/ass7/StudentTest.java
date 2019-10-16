package com.spatil.examples.ass7;

public class StudentTest {

	public static void main(String[] args) {

		Date d1 = new Date(5, 11, 1985);
		Date d2 = new Date(10, 6, 1991);

		Student stud = new Student(10, "Sunil", d1, new int[] { 67, 89, 32 });
		System.out.println(stud);

		Student stud1 = new Student(11, "Anil", d2, new int[] { 67, 89, 36 });
		System.out.println(stud1);
	}
}
