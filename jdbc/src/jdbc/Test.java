package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {

		String deleteQuery = "delete from student where id=?";
		String updateQuery ="";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try (Connection conn = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/nobel", 
						"sunil", "sunil@123");
				PreparedStatement ps = conn.prepareStatement(deleteQuery);
				) {

			ps.setInt(1, 3);

			int res = ps.executeUpdate();
			if (res >= 1) {
				System.out.println("Deletion done");
			} else {
				System.out.println("Deletion Failed");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
