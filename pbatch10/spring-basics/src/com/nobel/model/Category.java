package com.nobel.model;

public class Category {

	private String catName = "Shoes";
	private String catDesc = "Must wear shoes";

	public Category() {
		System.out.println("ctr called...");

	}

	public Category(String catName, String catDesc) {
		super();
		this.catName = catName;
		this.catDesc = catDesc;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	@Override
	public String toString() {
		return "[catName=" + catName + ", catDesc=" + catDesc + "]";
	}

}
