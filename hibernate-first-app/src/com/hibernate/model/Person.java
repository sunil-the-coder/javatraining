package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(value = { @NamedQuery(name = "allPersons", query = "from Person"),
		@NamedQuery(name = "personsByMobile", query = "from Person where mobile=:mobile") })

@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "getAllPersons", query = "select * from person", resultClass = Person.class) })
@Table(name = "person")
@Entity
public class Person {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	@Column(name = "phone")
	private String mobile;

	@Embedded
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

}
