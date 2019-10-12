package com.itp.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itp.book.db.DBConnection;

public class TransactionTest {

	public static void main(String[] args) {

		String queryStudent = "insert into student values(?,?,?)";
		String queryStudentAddr = "insert into address values(?,?,?,?)";

		Connection conn = DBConnection.getConnection();
		try  {

			conn.setAutoCommit(false);
			
			PreparedStatement psInsertStudent = conn.prepareStatement(queryStudent);
			PreparedStatement psInsertAddress = conn.prepareStatement(queryStudentAddr);

			psInsertStudent.setInt(1, 6);
			psInsertStudent.setString(2, "Mandal");
			psInsertStudent.setString(3, "82906");

			psInsertStudent.executeUpdate();
			System.out.println("Student Record is Updated.");

			psInsertAddress.setInt(1, 1);
			psInsertAddress.setString(2, "Wakad");
			psInsertAddress.setString(3, "411033");
			psInsertAddress.setInt(4, 3);
			psInsertAddress.executeUpdate();
			System.out.println("Student Address is updated");

			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		DBConnection.close();

	}
}
