
interface A {
	int data = 10; // public static final data = 10;
	void disp();
	void show();
}

class B implements A {

	@Override
	public void disp() {
		System.out.println("B disp");
	}

	@Override
	public void show() {
		System.out.println("B show");
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new B();
		a.disp();
		a.show();
	}
}
