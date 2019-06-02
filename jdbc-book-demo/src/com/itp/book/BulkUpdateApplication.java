package com.itp.book;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itp.book.db.DBConnection;

public class BulkUpdateApplication {

	public static void main(String[] args) {

		String query = "insert into static_data values(?,?)";
		
		try (Connection conn = DBConnection.getConnection()) {
			PreparedStatement psInsert = conn.prepareStatement(query);
			long startTime = System.currentTimeMillis();
			for(int i = 1; i <= 10; i++) {
				psInsert.setInt(1, i);
				psInsert.setString(2, "Name"+i);
				psInsert.addBatch();
			}
			psInsert.executeBatch();
			
			long endTime = System.currentTimeMillis();
			System.out.println("Total time for Query:"+(endTime-startTime)+" ms");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
