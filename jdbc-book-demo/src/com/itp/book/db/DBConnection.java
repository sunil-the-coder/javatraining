package com.itp.book.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection conn;

	public static synchronized Connection getConnection() {
		try {
			if (conn == null) {
				conn = DriverManager.
						getConnection("jdbc:mysql://localhost:3306/nobel?rewriteBatchedStatements=true",
								"sunil", "sunil@123");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close() {
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
