package src;

class Student {

	// Data members of the class
	private int id = 10;
	private String name;// = "Sunil";
	private static int age = 25;
	boolean b;

	public Student() {
		System.out.println("student default ctr called...." + name.toUpperCase());
	}

	public Student(int age) {
		System.out.println("student int ctr called....");
	}

	// Methods
	public void disp() {

		System.out.println("disp is called...");
	}

	public static void show() {
		System.out.println("Show is called...");
	}

}

public class Test {

	public static void main(String[] args) {

		String s1 = "SUNIL#PATIL#SHEVATE";

		char t = s1.charAt(2);
		System.out.println(t);

		
		String r = s1.substring(2);
		System.out.println(r);
		
		String s2 = s1.substring(2,6);
		System.out.println(s2);
		
		int l = s1.length();
		System.out.println(l);
		
		String s4 = s1.concat("Pune");
		System.out.println(s4);
		
		//Searching string inside big string from start to end
		int index = s1.indexOf("I");
		System.out.println(index);
		
		int in = s1.indexOf("PA");
		System.out.println(in);		
	
		//search from end to start ( backward )
		int inLast = s1.lastIndexOf("I");
		System.out.println(inLast);
		
		
		String s3 = "";
		boolean status = s3.isEmpty();
		System.out.println(status);
		
		String s5 = s1.toLowerCase();
		System.out.println(s5);
		
		char[] arr = s1.toCharArray();
		for(char ch : arr)
			System.out.println(ch);
		
		
		String[] strs = s1.split("#");
		for(String str : strs)
			System.out.println(str);

		System.out.println("startsWith:"+s1.startsWith("SUNIL"));
		System.out.println("endsWith:"+s1.endsWith("SHEVATE"));
		
	}
	
	
	
	
	
	
	
	
	
	

}




