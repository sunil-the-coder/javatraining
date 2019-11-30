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
		Book b3 = new Book(100, "SCJP", "Kathy");
		
		//b1.setAuthor("test");

		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		
		System.out.println(b1 == b3); // false
		System.out.println(b1.equals(b2)); // true / false
		System.out.println(b2.equals(b3)); // false
		System.out.println(b1.equals(b3)); // true
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(10, "Effective Java", "Scott"));
		books.add(new Book(11, "SCJP", "Kathy Sierra"));
		books.add(new Book(12, "Head First Java", "Kathy Sierra"));
		books.add(new Book(13, "Advanced Programming with Java", "Kathy Sierra"));
		books.add(new Book(14, "Core Java", "Scott"));

		System.out.println("\n************ All Books **************");
		for (Book book : books) {
			System.out.println(book);
		}
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Sunil",10);
		Integer oldValue = map.put("Sunil",11);
		System.out.println(oldValue);
		
		//To retrieve key-value pairs 
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		for(Map.Entry<String,Integer> entry : entries){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	
	}
}
