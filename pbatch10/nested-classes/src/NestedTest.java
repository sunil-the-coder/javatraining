
class Outer {
	private int data = 10;

	class Inner {
		private int data = 100;

		public void show() {
			int data = 1000;
			System.out.println("Data is:" + data);
			System.out.println("Data is:" + this.data);
			System.out.println("Data is:" + Outer.this.data);

			// Outer.this -> Reference to object of outer class
		}
	}
}

public class NestedTest {

	public static void main(String[] args) {

		new Outer().new Inner().show();
	}

}
