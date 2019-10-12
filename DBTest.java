package com.itp.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;

public class DBTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// 1. Load the driver into memory
			//Class.forName("com.mysql.jdbc.Driver");

			// 2. Obtain the database connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");

			// 3. Prepare Statement / PreparedStatement
			String query = "select * from student";
			ps = conn.prepareStatement(query);

			// 4. Execute the query using statement
			rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				// rs.getString("name")
				String name = rs.getString(2);
				System.out.println(id + "\t" + name);
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(rs!= null) rs.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
