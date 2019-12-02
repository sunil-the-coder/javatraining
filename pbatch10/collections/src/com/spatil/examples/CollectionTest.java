package com.spatil.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Book implements Comparable<Book> {
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
		Book b2 = (Book) ob2;
		return this.name.equals(b2.name) && this.author.equals(b2.author);
	}

	@Override
	public int hashCode() {
		System.out.println("Calculating hashCode of Book");
		// Complex logic which return unique number for object.
		int value = 13; // ( prime number )
		value += value * this.author.hashCode();
		value += value * this.name.hashCode();
		return value;
	}

	//Callback method
	@Override
	public int compareTo(Book b2) {
		// Actual logic to return value
		return this.id - b2.id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}

class SortBookByAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return  b1.getAuthor().compareTo(b2.getAuthor());
	}
}

class SortBookByName implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return  b1.getName().compareTo(b2.getName());
	}
}


public class CollectionTest {

	public static void main(String[] args) {

		String str = "sunilpatilpune";
		List<Character> chars  = new LinkedList<>();
		for(char ch : str.toCharArray())
			chars.add(ch);
		
		int index = chars.indexOf('p');
		List<Character> newlist = chars.subList(index, chars.size());
		//System.out.println(newlist);
		
		StringBuilder sb = new StringBuilder();
		for(Character ch : newlist)
			sb.append(ch);
		
		System.out.println(sb.toString());
		
		
		
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(10, "SCJP", "Kathy"));
		books.add(new Book(13, "Core Java", "Kathy"));
		books.add(new Book(11, "Adv Java", "Herbert"));

		for (Book book : books)
			System.out.println(book);

		System.out.println("******** After Sorting ************");
		
		Collections.sort(books);

		for (Book book : books)
			System.out.println(book);

		
		System.out.println("******* Sorting on Author name **************");
		SortBookByAuthor sortBookByAuthor = new SortBookByAuthor();
		Collections.sort(books, sortBookByAuthor);
		
		for (Book book : books)
			System.out.println(book);
		
		
		System.out.println("******* Sorting on Book name **************");
		SortBookByName sortBookByName = new SortBookByName();
		Collections.sort(books, sortBookByName);
		for (Book book : books)
			System.out.println(book);
		
		
		
	}
}
