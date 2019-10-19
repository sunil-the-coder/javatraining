import java.util.Collection;
import java.util.LinkedList;

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
	public void show() {
		System.out.println("B show");
	}
}

class C extends B {

	public void disp() {
		System.out.println("C disp");
	}

	public void f1() {
		System.out.println("C f1");
	}
}

public class DemoTest {
	public static void main(String[] args) {

		A a = new C();
		a.disp();

		B b = (B) a;
		b.disp();
		b.show();
		// b.f1();

		C c = (C) b;
		c.f1();
		c.disp();
		c.show();
		
		
		Collection coll = new LinkedList();
		
		LinkedList l = (LinkedList)coll;
		
		

		/*
		 * B b = new C(); b.show(); b.disp();
		 * 
		 * C c = new C(); c.show(); c.disp();
		 */

	}
}
