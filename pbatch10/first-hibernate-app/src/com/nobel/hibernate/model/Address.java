package com.nobel.hibernate.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int pincode;
	private String street;
	private String landmark;
	private String city;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(int pincode, String street, String landmark, String city) {
		super();
		this.pincode = pincode;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}
}
