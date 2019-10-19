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

abstract class A {
	
	public A() {
		System.out.println("A ctr called");
	}
	
	//non-abstract
	public void disp() {
		System.out.println("A disp");
	}
}

abstract class B extends A {

	public B() {
		System.out.println("B ctr called");
	}
}

class C extends B {
	
	public C() {
		System.out.println("C ctr");
	}
	
	public void disp() {
		System.out.println("C disp");
	}
	 
	public void show() {
		System.out.println("C show");
	}
}

/*
 * class B extends A { public void show() { System.out.println("B show"); } }
 * 
 * class C extends B {
 * 
 * public void disp() { System.out.println("C disp"); }
 * 
 * public void f1() { System.out.println("C f1"); } }
 */

public class DemoTest {
	public static void main(String[] args) {

		A a = new C();
		a.disp();

	}
}
