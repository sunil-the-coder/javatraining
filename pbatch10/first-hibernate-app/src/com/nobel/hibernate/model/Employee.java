package com.nobel.hibernate.model;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String phone, int salary) {
		super(name, phone);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", salary=" + salary + "]";
	}

}
