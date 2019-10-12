
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

public class DemoTest {
	public static void main(String[] args) {

		Demo d1 = new Demo(10, 20);
		
		//static method call
		d1.setC(100);
		
		//non-static method call
		d1.disp();

		
		
		
		Demo d2 = new Demo(50, 60);
		
		//static method call
		d2.setC(200);
		
		//non-static method call
		d2.disp();
		d1.disp();
		
	}
}
