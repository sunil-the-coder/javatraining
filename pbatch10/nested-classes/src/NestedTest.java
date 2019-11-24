class Outer {

	private int data = 10;

	public void disp() {
		System.out.println("Outer disp called " + data);
	}

	class Inner {
		public void show() {
			System.out.println("Inner show called..");
		}
	}

}

public class NestedTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.disp();

		// 1. Creating inner class object using outer class object reference
		Outer.Inner inner = outer.new Inner();

		// 2. Creating inner class obj directly using outer class Object
		Outer.Inner inner2 = new Outer().new Inner();
		inner2.show();
		inner.show();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
