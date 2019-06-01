package com.itp.dao;

import java.util.List;

import com.itp.model.Book;

public interface BookDao {

	void save(Book book);

	Book findById(int id);

	List<Book> findAll();

	void update(Book book);

	boolean deleteById(int id);
}
