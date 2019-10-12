
class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void disp() {
		System.out.println("[id=" + id + ", name=" + name + "]");
	}

}

public class StudentTest {

	public static void main(String[] args) {
	
		Student s1 = new Student(10, "sunil");
		Student s2 = new Student(11, "anil");
		
		s1.disp();
		s2.disp();
		
		System.out.println("================================");
		
		//Array of Object
		Student[] students = new Student[5];
		students[0] = s1; 
		students[1] = new Student(100,"Ganesh");
		
		students[0].disp();
		students[1].disp();
		
		
		//Arrays in integer
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		int[] arr2 = new int[5];
		
		int[] arr3 = {10,20,30};
		
	
		int[] arr4 = new int[] {10,20,30,40,50};
		
		
		
		
		
	}
}
