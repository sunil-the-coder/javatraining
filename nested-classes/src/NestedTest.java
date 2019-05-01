
class Outer {

	static class Inner {
		public void disp() {
			System.out.println("inner disp called..");
		}
	}

	public void disp() {
		System.out.println("outer disp called..");
	}
}

public class NestedTest {

	public static void main(String[] args) {

		// 1. Creating static nested class object
		//( Only Inner class object will be created)
		Outer.Inner inner = new Outer.Inner();
		inner.disp();

	}
}
