import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nobel.db.DBConnection;

public class JdbcTest {

	public static void main(String[] args) {

		try {
			
			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement("update student set phone='9055' where name='sunil'");

			int res = ps.executeUpdate();

			if (res >= 1)
				System.out.println("Updation Done");
			else
				System.out.println("Updation Failed.");

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
