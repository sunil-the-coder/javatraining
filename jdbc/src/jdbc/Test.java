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

			String updateQuery = "update student set phone=? where id=?";
			
			PreparedStatement ps = conn.prepareStatement(updateQuery);
			ps.setString(1, "90897965");
			ps.setInt(2, 1);
			
			
			int res = ps.executeUpdate();
			if(res >= 1) {
				System.out.println("Updation done");
			}else {
				System.out.println("Updation Failed");
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
