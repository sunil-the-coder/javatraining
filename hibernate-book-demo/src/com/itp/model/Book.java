package com.itp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String bname;
	private String author;
	private int price;
	private Date publishedDate;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bname, String author, int price, Date publishedDate) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.publishedDate = publishedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", author=" + author + ", price=" + price + ", publishedDate="
				+ publishedDate + "]";
	}

}
