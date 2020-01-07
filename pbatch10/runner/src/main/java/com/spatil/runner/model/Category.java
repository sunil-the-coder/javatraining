package com.spatil.runner.model;

public class Category {

	private String catName;
	private String catDesc;

	public Category() {
		System.out.println("ctr called...");

	}

	public Category(String catName, String catDesc) {
		super();
		this.catName = catName;
		this.catDesc = catDesc;
		System.out.println("param ctr called...");
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	public void setFirstName(String firstName) {
		System.out.println("Setting firstName as " + firstName);
	}

	public String getCatDesc() {
		return catDesc;
	}

	@Override
	public String toString() {
		return "[catName=" + catName + ", catDesc=" + catDesc + "]";
	}

}
