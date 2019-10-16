package com.spatil.examples;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no of students:");
		int no = scan.nextInt();

		//Blank array of students with no of object
		Student[] studs = new Student[no];

		for (int i = 0; i < no; i++) {

			System.out.println("Enter name and percentage of student "+(i+1));
			
			//Accept details of the student from console
			String name = scan.next();
			double percentage = scan.nextDouble();
			
			//Prepare object of student with details and put it into array location
			studs[i] = new Student(i + 1, name, percentage);
		}

		//Sort the students based on percentage.
		Student.sortStudents(studs);
		
		//Print After Sorting
		for (int i = 0; i < no; i++) {
			System.out.println(studs[i]);
		}

		scan.close();

	}
}
