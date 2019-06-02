package com.itp.book;

import java.sql.Date;
import java.util.List;

import com.itp.book.db.DBConnection;
import com.itp.dao.BookDao;
import com.itp.dao.BookDaoImpl;
import com.itp.model.Book;

public class BookApplication {

	public static void main(String[] args) {

		Book book1 = new Book("Effective Java", "Scott", 450, new Date(System.currentTimeMillis()));
		Book book2 = new Book("SCJP", "Kathy Sierra", 890, new Date(System.currentTimeMillis()));

		BookDao bookDao = new BookDaoImpl();
		// bookDao.save(book1);
		// bookDao.save(book2);

		Book book = bookDao.findById(1);
		System.out.println(book);

		book.setPrice(560);
		book.setBname("Effective Java in Nutshell");

		bookDao.update(book);

		System.out.println("----------- All Books ----------");
		List<Book> books = bookDao.findAll();
		for (Book b : books)
			System.out.println(b);

		//close database connection once done with all operations.
		DBConnection.close();

	}
}
