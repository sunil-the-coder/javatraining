package com.itp.oshop.model;

public class CartProduct {

	private int pid;
	private String name;
	private int price;
	private int qty;

	public CartProduct(int pid, String name, int price, int qty) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
