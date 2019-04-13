
abstract class A {
	// abstract/blank method
	public abstract void disp();
	
	//non-abstract
	public void show() {
		System.out.println("A show");
	}
}

class B extends A {

	public void disp() {
		System.out.println("B disp");
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new B();
		a.disp();
		a.show();
	}
}
