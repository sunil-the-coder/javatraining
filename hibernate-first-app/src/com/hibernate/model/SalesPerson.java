package com.hibernate.model;

import javax.persistence.Entity;

@Entity
public class SalesPerson extends Person {

	private int commision;

	public int getSalary() {
		return commision;
	}

	public void setSalary(int salary) {
		this.commision = salary;
	}

	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesPerson(String name, String mobile, int commision) {
		super(name, mobile);
		this.commision = commision;
	}

}
