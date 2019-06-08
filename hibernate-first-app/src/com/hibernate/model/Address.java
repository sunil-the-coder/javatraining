package com.hibernate.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	private int pincode;
	private String city;

	@Override
	public String toString() {
		return " [street=" + street + ", pincode=" + pincode + ", city=" + city + "]";
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, int pincode, String city) {
		super();
		this.street = street;
		this.pincode = pincode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
