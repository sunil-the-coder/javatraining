package com.itp.book.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
