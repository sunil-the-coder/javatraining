package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");

			System.out.println(conn);
			// "select * from student where name=? and id=?"
			// String insertQuery = "insert into student values(?,?,?)";
			// String updateQuery = "update student set phone=? where id=?";

			String deleteQuery = "delete from student where id=?";

			ps = conn.prepareStatement(deleteQuery);
			ps.setInt(1, 2);

			int res = ps.executeUpdate();
			if (res >= 1) {
				System.out.println("Deletion done");
			} else {
				System.out.println("Deletion Failed");
			}

			/*
			 * ResultSet rs = ps.executeQuery(); // iterate over the result while
			 * (rs.next()) { int id = rs.getInt("id"); String name = rs.getString(2); String
			 * phone = rs.getString("phone"); System.out.println(id + "\t" + name + "\t" +
			 * phone); }
			 */
			// rs.close();

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
