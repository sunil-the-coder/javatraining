package com.spatil.examples.ass7;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}
