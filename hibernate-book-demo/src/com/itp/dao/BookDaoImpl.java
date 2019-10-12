package com.itp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.itp.book.util.HibernateUtil;
import com.itp.model.Book;

public class BookDaoImpl implements BookDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public void save(Book book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Book findById(int id) {
		Session session = sessionFactory.openSession();
		Book book = (Book)session.get(Book.class, id);
		session.close();
		return book;
	}

	private Book getPopulatedBook(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt("id"));
		book.setBname(rs.getString("bname"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getInt("price"));
		book.setPublishedDate(rs.getDate("publishedDate"));
		return book;
	}

	@Override
	public List<Book> findAll() {
		List<Book> books = new ArrayList<>();

		/*
		 * String query = "select * from book"; try (PreparedStatement ps =
		 * conn.prepareStatement(query); ResultSet rs = ps.executeQuery();) { while
		 * (rs.next()) { Book book = getPopulatedBook(rs); books.add(book); }
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		return books;
	}

	@Override
	public void update(Book book) {
		/*
		 * String query =
		 * "update book set bname=?, author=?,price=?,publishedDate=?  where id=?";
		 * 
		 * try (PreparedStatement ps = conn.prepareStatement(query)) {
		 * 
		 * ps.setString(1, book.getBname()); ps.setString(2, book.getAuthor());
		 * ps.setInt(3, book.getPrice()); ps.setDate(4, book.getPublishedDate());
		 * ps.setInt(5, book.getId());
		 * 
		 * ps.executeUpdate();
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
