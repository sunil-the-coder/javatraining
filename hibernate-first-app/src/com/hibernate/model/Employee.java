package com.hibernate.model;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String mobile, int salary) {
		super(name, mobile);
		this.salary = salary;
	}

}
