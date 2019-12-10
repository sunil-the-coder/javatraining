import com.nobel.db.StudentService;
import com.nobel.model.Student;

public class StudentServiceClient {

	public static void main(String[] args) {

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
	}
}
