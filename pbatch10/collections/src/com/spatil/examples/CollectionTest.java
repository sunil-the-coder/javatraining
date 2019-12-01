package com.spatil.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Book {
	private int id;
	private String name;
	private String author;

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public boolean equals(Object ob2) {
		System.out.println("Comparing book object....");
		Book b2  = (Book) ob2;
		return this.name.equals(b2.name) && this.author.equals(b2.author);
	}
	
	@Override
	public int hashCode() {
		System.out.println("Calculating hashCode of Book");
		//Complex logic which return unique number for object.
		int value = 13; // ( prime number )
		value += value * this.author.hashCode();
		value += value * this.name.hashCode();
		return value;
	}
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}

public class CollectionTest {
	
	public static void main(String[] args) {

		Book b1 = new Book(10, "SCJP", "Kathy");
		Book b2 = new Book(11, "Core Java", "Kathy");
		Book b3 = new Book(12, "Adv Java", "Herbert");
				
		Map<Integer,Book> map = new HashMap<>();
		map.put(100,b1);
		map.put(101,b2);
		
		System.out.println(map.get(102));
		
		Map<Book,Integer> bookMap = new HashMap<>();
		bookMap.put(b1,100);
		bookMap.put(b2,200);
		bookMap.put(new Book(12, "Adv Java", "Herbert"),300);
		
		System.out.println(bookMap.get(new Book(122, "Adv Java", "Kathy"))); //300
		
		
		//To retrieve key-value pairs 
		/*
		 * Set<Map.Entry<Integer,Book>> entries = map.entrySet();
		 * for(Map.Entry<Integer,Book> entry : entries){
		 * System.out.println(entry.getKey()+"="+entry.getValue()); }
		 */
		
	
	}
}
