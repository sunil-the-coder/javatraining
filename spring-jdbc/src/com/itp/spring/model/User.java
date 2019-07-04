package com.itp.spring.model;

public class User {

	private int id;
	private String uname;
	private String passwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public User(int id, String uname, String passwd) {
		super();
		this.id = id;
		this.uname = uname;
		this.passwd = passwd;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", passwd=" + passwd + "]";
	}

}
