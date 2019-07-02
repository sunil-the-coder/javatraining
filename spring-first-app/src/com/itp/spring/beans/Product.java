package com.itp.spring.beans;

public class Product {

	private int id = 10;
	private String name = "adidas shoes";

	// Loose coupling
	private Rating rating;

	public Product() {
		System.out.println("def ctr called");
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public void setId(int id) {
		System.out.println("setting id:" + id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name:" + name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

}
