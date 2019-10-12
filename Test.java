class Student
{
	private int id;

	Student(int id) {
		this.id = id;
	}

	public boolean equals(Object obj) {

		System.out.println("Student equals() called");

		if(this == obj) 
			return true;

		if(obj != null && obj instanceof Student) {
			Student s2 = (Student)obj;
			if(this.id == s2.id)	
				return true;	
		}
		
		return false;
	}

	public static void main(String[] args)
	{
		Student s1 = new Student(10);
		Student s2 = new Student(20);

		String s3 = new String("sunil");

		boolean f = s1.equals(s3);

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

		int a = 10;
		a = a == 11 ||  ++a;
		System.out.println(a);
	}
}




