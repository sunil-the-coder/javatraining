package com.nobel.oshop.model;

public class CartProduct {

	private int pid;
	private String prodName;
	private int price;
	private int qty;

	public CartProduct(int pid, String prodName, int price, int qty) {
		super();
		this.pid = pid;
		this.prodName = prodName;
		this.price = price;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
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
