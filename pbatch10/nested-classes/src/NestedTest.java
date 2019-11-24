class Outer {

	private int data = 10;

	
	static int mark = 100;
	
	
	public void disp() {
		System.out.println("Outer disp called " + data);
	}

	static class Inner {
		public void show() {
			System.out.println("Inner show called..");
		}
	}

}

public class NestedTest {

	public static void main(String[] args) {

		
		Outer.mark = 200;
		
		//2. Creating object of static nested class directly without outer class obj
		Outer.Inner inn = new Outer.Inner();
		inn.show();
		
		
		
		
		
		
		
	}

}
