
class Outer {
	public void disp() {
		
		//Method local inner class
		class Inner {
			public void disp() {
				System.out.println("method local inner disp called..");
			}
		}

		Inner inner = new Inner();
		inner.disp();
	}
}

public class NestedTest {

	public static void main(String[] args) {
		new Outer().disp();
	}
}
