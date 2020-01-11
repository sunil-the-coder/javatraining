package com.spatil.demo.model;

public class UserRating {

	private String userName;
	private int rating;

	public UserRating(String userName, int rating) {
		super();
		this.userName = userName;
		this.rating = rating;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	};

}
