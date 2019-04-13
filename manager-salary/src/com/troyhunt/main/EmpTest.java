package com.troyhunt.main;

import com.troyhunt.model.Employee;
import com.troyhunt.model.Manager;

public class EmpTest {

	public static void main(String[] args) {

		Employee[] managers = new Employee[3];

		managers[0] = new Manager(1, "ABC", "Health", 850000, 4000);
		managers[1] = new Manager(2, "PQR", "Science", 40000, 6000);
		managers[2] = new Manager(3, "XYZ", "IT", 80000, 2000);

		int max = managers[0].getSalary();
		int index = -1;
		
		for (int i = 1; i < managers.length; i++) {
			if(managers[i].getSalary() > max) {
				max = managers[i].getSalary();
				index = i;
			}
		}
		
		if(index != -1)
			System.out.println(managers[index]);
		else
			System.out.println(managers[0]);
	}
}
