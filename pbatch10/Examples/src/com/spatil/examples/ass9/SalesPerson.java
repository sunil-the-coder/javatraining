package com.spatil.examples.ass9;

public class SalesPerson extends Manager {

	private int commision;

	public SalesPerson(int id, String name, String dept, int salary, int bonus, int commision) {
		super(id, name, dept, salary, bonus);
		this.commision = commision;
	}

	@Override
	public int getSalary() {		
		return super.getSalary() + commision;
	}

}
