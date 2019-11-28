package com.itp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.itp.model.Book;

public class BookService {

	// In Memory Database
	private List<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		// Store into memory
		books.add(book);
	}

	public Book getBookById(int id) {
		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	public List<Book> getAllBooks() {
		return books;
	}

	public List<Book> getBooksByAuthorName(String authorName) {
		List<Book> authorBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(authorName))
				authorBooks.add(book);
		}
		return authorBooks;
	}

	public void deleteById(int id) {
		// search book by given id and delete it from list.
		Iterator<Book> itr = books.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			if (book.getId() == id)
				itr.remove();
		}
	}
}
