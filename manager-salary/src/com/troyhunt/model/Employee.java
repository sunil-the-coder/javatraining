package com.troyhunt.model;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int salary;

	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ",";
	}
	
	public int getSalary() {
		return salary;
	}

}
