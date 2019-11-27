package com.spatil.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	public static List<Book> filterBooksByAuthor(List<Book> books, String authorName) {
		List<Book> authorBooks = new ArrayList<>();

		// Filter books based on given author name & add into the authorBooks list and
		// then return it

		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(authorName))
				authorBooks.add(book);
		}

		return authorBooks;
	}

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
		
		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			if (book.getId() == 14)
				itr.remove(); // Safe way to delete element from collection while iterating over it.
		}

		System.out.println("\n************ After Deletion of Book by ID **************");
		for (Book book : books) {
			System.out.println(book);
		}
		
		for (Book book : books) {
			if (book.getName().equals("SCJP"))
				book.setAuthor(book.getAuthor() + " & James");
		}

		System.out.println("\n************ After updating books author name **************");	
		for (Book book : books) {
			System.out.println(book);
		}

		List<Book> booksByAuthor = filterBooksByAuthor(books, "Scott");

		System.out.println("\n********* After Books by Author *******");
		for (Book book : booksByAuthor) {
			System.out.println(book);
		}

	}
}
