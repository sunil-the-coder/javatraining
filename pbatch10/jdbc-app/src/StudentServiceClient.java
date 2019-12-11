import com.nobel.db.DBConnection;
import com.nobel.db.StudentService;
import com.nobel.model.Student;

public class StudentServiceClient {

	public static void main(String[] args) {

		//Singleton pattern
//		Connection conn1 = DBConnection.getConnection();
//		Connection conn2 = DBConnection.getConnection();
//		Connection conn3 = DBConnection.getConnection();
//		
//		System.out.println(conn1);
//		System.out.println(conn2);
//		System.out.println(conn3);
		
		
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		Runtime runtime3 = Runtime.getRuntime();
		
		System.out.println(runtime1);
		System.out.println(runtime2);
		System.out.println(runtime3);
		
		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(1);
		//System.out.println(student);

		for (Student stud : studentService.getAllStudents()) {
			System.out.println(stud);
		}
		
		boolean isDeleted = studentService.deleteStudentById(1);
		if(isDeleted)
			System.out.println("Student Deleted");
		else
			System.out.println("Deletion Failed.");
		
		DBConnection.close();
	}
}










