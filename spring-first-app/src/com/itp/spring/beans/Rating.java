package com.itp.spring.beans;

public class Rating {

	private int rating;

	public Rating() {
		// TODO Auto-generated constructor stub
	}

	public Rating(int rating) {
		super();
		System.out.println("Rating param ctr called.");		
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "[rating=" + rating + "]";
	}
	
	

}
