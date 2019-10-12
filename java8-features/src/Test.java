import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface A {
	// java 8 feature
	static void disp() {
	}

	// java 8
	default void show() {
	}
}

class Student {
	private int age;
	private String name;
	private String college;

	public Student(int age, String name, String college) {
		super();
		this.age = age;
		this.name = name;
		this.college = college;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", college=" + college + "]";
	}

}

public class Test {

	public static void main(String[] args) {

		Stream<Integer> ints = Stream.of(1, 2, 3, 4, 5, 6);
		ints.forEach(p -> System.out.println(p));

		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		numbers.stream().forEach(p -> System.out.println(p));

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		Stream<String> filteredNames = memberNames.stream().filter(name -> !name.startsWith("S"));
		List<String> upperNames = filteredNames.map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperNames);

		// filteredNames.forEach(n-> System.out.println(n.toUpperCase()));

		List<Student> students = new LinkedList<>();
		students.add(new Student(19, "Akshay", "Indira"));
		students.add(new Student(23, "Satish", "IBMR"));
		students.add(new Student(24, "Prakash", "Indira"));
		students.add(new Student(20, "Mandal", "IBMR"));
		students.add(new Student(19, "Dhanashree", "Fergusson"));
		students.add(new Student(17, "Komal", "Fergusson"));
		
		
		List<Student> fergussonStudents = students.stream().filter(s -> s.getCollege().equals("Fergusson")).collect(Collectors.toList());
		System.out.println(fergussonStudents);
		
		Set<Student> indiraStudents = students.parallelStream().filter(s -> s.getAge() > 19 && s.getCollege().equals("Indira")).collect(Collectors.toSet());
		System.out.println(indiraStudents);
		
		
	}
}
