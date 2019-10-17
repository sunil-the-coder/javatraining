
class Demo {

	private int a, b;
	private static int c;

	public Demo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void setC(int nc) {
		c = nc;
	}

	public void disp() {
		System.out.println("A:" + a + ",B:" + b + ",C:" + c);
	}

}

class A {
	public void disp() {
		System.out.println("A disp");
	}
}

class B extends A {
	
	public void disp() {
		System.out.println("B disp");
	}
}

public class DemoTest {
	public static void main(String[] args) {

		A aRef = new A();
		aRef.disp();

		B bRef = new B();
		bRef.disp();

		A aRef2 = new B();
		aRef2.disp();

	}
}
