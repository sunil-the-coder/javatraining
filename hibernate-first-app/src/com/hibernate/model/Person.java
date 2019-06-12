package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Table(name = "person")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Cache(region = "itp.cache",usage = CacheConcurrencyStrategy.READ_ONLY)
public class Person {

	@Id
	@GeneratedValue
	//@SequenceGenerator(name = "person_id_seq",sequenceName = "PERSON_ID_DB_SEQ")
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

}
