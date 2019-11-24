
class A {

}

class B {
}

class Outer {

	private int data = 10;

	public void disp() {
		System.out.println("Outer disp called " + data);

		// Method local inner class
		class Inner {
			public void show() {
				System.out.println("Inner show called..");
			}
		}

		Inner obj = new Inner();
		obj.show();
	}
}

class Demo {
	public void show() {
		System.out.println("Demo show called..");
	}
}

//class NewDemo extends Demo
//{
//	@Override
//	public void show() {
//		System.out.println("New Demo show called...");
//	}
//}

//class NestedTest$1 extends Demo
//{
//	@Override
//	public void show() {
//		System.out.println("New Version of demo show called..");
//	}
//}


public class NestedTest {

	public static void main(String[] args) {

		Demo d = new Demo() {
			@Override
			public void show() {
				System.out.println("New Version of demo show called..");
			}
		};
		
		d.show();
	}

}













