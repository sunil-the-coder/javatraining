package com.spatil.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

	@Override
	public int compareTo(Book o) {
		// Actual logic to return value
		return 0;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}

class SortBookByAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		//same logic for returning value
		return 0;
	}
}

public class CollectionTest {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();
		books.add(new Book(10, "SCJP", "Kathy"));
		books.add(new Book(11, "Core Java", "Kathy"));
		books.add(new Book(12, "Adv Java", "Herbert"));

		for (Book book : books)
			System.out.println(book);

		Collections.shuffle(books);
		System.out.println(books);

		Collections.reverse(books);
		System.out.println(books);

		Collections.sort(books);
		System.out.println(books);

		List<String> names = Arrays.asList("sunil", "ganesh", "satish", "akash", "anil", "ganesh");
		System.out.println(names);

		Collections.shuffle(names);
		System.out.println(names);

		Collections.reverse(names);
		System.out.println(names);

		int index = Collections.binarySearch(names, "ganesh");
		System.out.println(index);

		int count = Collections.frequency(names, "ganesh");
		System.out.println(count);

		Collections.sort(names);
		System.out.println(names);

	}
}
