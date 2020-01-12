import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Student {
	private String name;

}

public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Sunil");
		
		System.out.println(student.getName());
	}

}
