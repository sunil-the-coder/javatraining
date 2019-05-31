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

			// Statement stmt = conn.createStatement();

			String sname = args[0];
			int sid = 1;

			PreparedStatement ps = conn.prepareStatement("select * from student  where name=? and id=?");
			ps.setString(1, sname);
			ps.setInt(2, sid);

			ResultSet rs = ps.executeQuery();
			// iterate over the result
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString(2);
				String phone = rs.getString("phone");
				System.out.println(id + "\t" + name + "\t" + phone);
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
