class Student
{
	private int id;

	Student(int id) {
		this.id = id;
	}

	public boolean equals(Object obj) {
		System.out.println("Student equals() called");

		if(obj == null)
			return false;

		//1. Identify the object properties for the object which are unique.

		Student s2 = (Student)obj;

		if(this.id == s2.id)	
			return true;	
		
		return false;
	}

	public static void main(String[] args)
	{
		Student s1 = new Student(10);
		Student s2 = new Student(20);

		boolean f = s1.equals(null);

		System.out.println("Result:"+f);

		String str1 = new String("sunil");
		String str2 = new String("sunil");

		System.out.println(str1.equals(str2));
	}
}


class A
{
	public void disp() {
		System.out.println("A disp");	
	}
}

class B extends A
{
	public void disp() {
		System.out.println("B disp");	
	}

	public void show() {
		System.out.println("B disp");	
	}
}
public class Test
{

	public static void main(String[] args)
	{
		A a = new B();
		a.disp();
		//a.show();

	}
}




