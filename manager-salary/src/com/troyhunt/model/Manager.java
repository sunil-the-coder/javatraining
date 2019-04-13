package com.troyhunt.model;

public class Manager extends Employee {

	private int bonus;

	public Manager(int id, String name, String dept, int salary, int bonus) {
		super(id, name, dept, salary);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " bonus=" + bonus + "]";
	}

	public int getSalary() {
		return super.getSalary() + bonus;
	}
}
