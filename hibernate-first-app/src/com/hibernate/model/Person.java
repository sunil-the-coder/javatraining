package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="person")
@Entity
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@Column(name = "phone")
	private String mobile;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
