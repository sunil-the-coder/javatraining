package com.itp.oshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	private int catId;
	private String catName;
	private String catDesc;
	private String catImgUrl;

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
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

}
