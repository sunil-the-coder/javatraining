package com.hibernate.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "person")
@Entity
public class Person {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	@Column(name = "phone")
	private String mobile;

	@OneToMany(cascade =CascadeType.ALL, mappedBy = "person")
	private List<Vehicle> vehicles = new LinkedList<>();

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + ", vehicles=" + vehicles + "]";
	}

}
