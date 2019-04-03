class Student
{
	public static void main(String[] args)
	{
		System.out.println("student main called");
	}
}

public class Test
{

	public static void main(String[] args)
	{
		System.out.println("Test main called");
		//SCP -> literals -> String Constant Pool
		String s1 = "sunil";
		String s3 = "sunil";

		//new String -> Stores on Heap
		String s2 = new String("sunil");		
		String s4 = new String("sunil");		

		boolean res = (s1 == s3);

		boolean eq = s1.equals(s3);

		System.out.println("Res:"+res);

		System.out.println("Equals:"+eq);

	}
}

