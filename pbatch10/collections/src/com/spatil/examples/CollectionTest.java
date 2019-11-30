package com.spatil.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
	public String toString() {
		return "[id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}

public class CollectionTest {
	
	public static void main(String[] args) {

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

		
		Map<Integer,String> map = new HashMap<>();
		map.put(10,"Sunil");
		map.put(11,"Anil");
		map.put(12,"Shivansh");
		
		
		//To retrieve key-value pairs 
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		for(Map.Entry<Integer,String> entry : entries){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		//For only values
		Collection<String> values = map.values();
		System.out.println(values);
		
		//For only keys
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			String value = map.get(key);
			System.out.println(key+"="+value);
		}
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			Integer key  = itr.next();
			String value = map.get(key);
			System.out.println(key+"="+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
