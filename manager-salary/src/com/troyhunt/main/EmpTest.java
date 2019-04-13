package com.troyhunt.main;

import com.troyhunt.model.Employee;
import com.troyhunt.model.Manager;

public class EmpTest {

	public static void main(String[] args) {

		Employee[] managers = new Employee[3];

		managers[0] = new Manager(1, "ABC", "Health", 850000, 4000);
		managers[1] = new Manager(2, "PQR", "Science", 40000, 6000);
		managers[2] = new Manager(3, "XYZ", "IT", 80000, 2000);

		sortEmployees(managers);

		for (Employee employee : managers) {
			System.out.println(employee);
		}

		/*
		 * int max = managers[0].getSalary(); int index = -1;
		 * 
		 * for (int i = 1; i < managers.length; i++) { if(managers[i].getSalary() > max)
		 * { max = managers[i].getSalary(); index = i; } }
		 * 
		 * if(index != -1) System.out.println(managers[index]); else
		 * System.out.println(managers[0]);
		 */
	}

	private static void sortEmployees(Employee[] managers) {

		for (int i = 0; i < managers.length; i++) {
			for (int j = i+1; j < managers.length; j++) {

				if (managers[i].getSalary() > managers[j].getSalary()) {
					// swap
					Employee e = managers[i];
					managers[i] = managers[i + 1];
					managers[i + 1] = e;
				}
			}

		}
	}
}
