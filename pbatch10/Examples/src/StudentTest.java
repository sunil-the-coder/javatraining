class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return  "[id=" + id + ", name=" + name + "]";
	}
	
	public void disp() {
		System.out.println("[id=" + id + ", name=" + name + "]");
	}

}

public class StudentTest {

	public static void main(String[] args) {

		int a = 10;
		System.out.println(a);
		
		String s = new String("sunil");
		System.out.println(s);
		
		Student stud = new Student(10,"Sunil");
		System.out.println(stud.toString());
		
		Student stud2 = new Student(100,"Anil");
		System.out.println(stud2);
		
		String sData = stud2.toString();
		System.out.println(sData);
		
		
	}
}
