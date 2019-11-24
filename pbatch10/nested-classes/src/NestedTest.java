class Outer {

	private int data = 10;

	public void disp() {
		System.out.println("Outer disp called " + data);

		//Method local inner class
		class Inner {
			public void show() {
				System.out.println("Inner show called..");
			}
		}
		
		Inner obj = new Inner();
		obj.show();
	}
}

public class NestedTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.disp();
	}

}
