package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");

			// "select * from student where name=? and id=?"
			String insertQuery = "insert into student values(?,?,?)";

			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setInt(1, 3);
			ps.setString(2, "Akshay");
			ps.setString(3, "236262");

			
			int res = ps.executeUpdate();
			if(res >= 1) {
				System.out.println("Insertion done");
			}else {
				System.out.println("Insertion Failed");
			}
			
			
			/*
			 * ResultSet rs = ps.executeQuery(); // iterate over the result while
			 * (rs.next()) { int id = rs.getInt("id"); String name = rs.getString(2); String
			 * phone = rs.getString("phone"); System.out.println(id + "\t" + name + "\t" +
			 * phone); }
			 */
			//rs.close();
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
