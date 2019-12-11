import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nobel.db.DBConnection;

public class BulkUpload {

	public static void main(String[] args) {

		Connection conn = DBConnection.getConnection();

		try {

			// Instant startTime = Instant.now();
			long startTime = System.currentTimeMillis();

			PreparedStatement psInsert = conn.prepareStatement("insert into bulk_data values(?,?)");

			for (int i = 1; i <= 10000; i++) {
				psInsert.setInt(1, i);
				psInsert.setString(2, "test" + i);

				psInsert.addBatch();
			}

			psInsert.executeBatch();
			
			// Instant endTime = Instant.now();
			long endTime = System.currentTimeMillis();
			System.out.println("Total time :" + (endTime - startTime) + " ms");

			System.out.println("Data Insertion Done");

			psInsert.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
