import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {

		// Steps to retrieve data from db.

		try {
			// 1. Load driver into memory & drive itself registers with DriverManager.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Obtain the database connection.
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");

			// 3. Prepare the statement with dynamic parameters
			PreparedStatement ps = conn.prepareStatement("update student set phone='9055' where name='sunil'");
			
	
			// 4. Execute Query
			int res = ps.executeUpdate();

			if(res >= 1)
				System.out.println("Updation Done");
			else
				System.out.println("Updation Failed.");
			
			
			/*
			 * // 5.Read row by row data from rs & get column values. while (rs.next()) {
			 * int roll = rs.getInt(1); String name = rs.getString("name"); String phone =
			 * rs.getString("phone");
			 * 
			 * System.out.println(roll + "\t" + name + "\t" + phone); }
			 * 
			 * // 6. Close the resources rs.close();
			 */			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
