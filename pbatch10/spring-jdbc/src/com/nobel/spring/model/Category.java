package com.nobel.spring.model;

public class Category {

	private int id;
	private String catName;
	private String catDesc;
	private String catImgUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	public String getCatImgUrl() {
		return catImgUrl;
	}

	public void setCatImgUrl(String catImgUrl) {
		this.catImgUrl = catImgUrl;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", catName=" + catName + ", catDesc=" + catDesc + ", catImgUrl=" + catImgUrl
				+ "]";
	}

}
