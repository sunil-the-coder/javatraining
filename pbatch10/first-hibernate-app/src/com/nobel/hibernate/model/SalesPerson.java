package com.nobel.hibernate.model;

import javax.persistence.Entity;

@Entity
public class SalesPerson extends Person {

	private int commission;

	public SalesPerson(String name, String phone, int salary) {
		super(name, phone);
		this.commission = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", commission=" + commission + "]";
	}

}
