package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try {
			//Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select *from student");
			
			//iterate over the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString(2);
				String phone = rs.getString("phone");
				System.out.println(id+"\t"+name+"\t"+phone);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}  catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
