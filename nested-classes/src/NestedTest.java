
class Outer {
	public void disp() {
		// Method local inner class
		class Inner {
			public void disp() {
				System.out.println("method local inner disp called..");
			}
		}

		Inner inner = new Inner();
		inner.disp();
	}
}

interface A {
	void show();
}

public class NestedTest {

	public static void callApi(A ref) {
		ref.show();
	}

	public static void main(String[] args) {

		A testRef = new A() {
			public void show() {
				System.out.println("Anonymous lambda called");
			};			
		};
		
		callApi(testRef);

		A ref = new A() {
			@Override
			public void show() {
				System.out.println("Anonymous called");
			}
		};

		ref.show();

	}
}
