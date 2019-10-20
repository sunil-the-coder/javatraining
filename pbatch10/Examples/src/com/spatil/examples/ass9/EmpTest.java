package com.spatil.examples.ass9;

import java.util.Scanner;

public class EmpTest {

	// Loosly coupled method
	public static int getIndexForHighestSalaryManager(Employee[] employees) {

		if (employees.length <= 0)
			return -1;

		int index = 0;
		int max = employees[0].getSalary();
		for (int i = 1; i < employees.length; i++) {
			if (employees[i].getSalary() > max) {
				max = employees[i].getSalary();
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Employee[] employees = new Employee[5];

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter name, dept,salary,bonus:");
			employees[i] = new Manager(i + 1, scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
		}

		// employees[4] = new SalesPerson(10, "test", "tst", 25000, 25000, 3000);

		int index = getIndexForHighestSalaryManager(employees);

		System.out.println(employees[index]);

		scan.close();
	}
}
