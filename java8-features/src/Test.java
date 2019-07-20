@FunctionalInterface // ( can't declare multiple methods inside functional interface)
interface A {
	void disp(int x, int y);
}

/*
 * class C implements A { public void disp() {
 * System.out.println("C disp called..."); } }
 */

class B {
	public void show(A a) {
		a.disp(10,20);
	}
}


/*class OddThread implements Runnable
{
	@Override
	public void run() {
		for(;;) {
			System.out.println("Odd thread running....");
		}
	}
}*/

public class Test {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(;;) {
					System.out.println("Odd thread running....");
				}		
			}
		};
		
		Thread t1 = new Thread(runnable);
		
		t1.start();
		
		
		
		
		B b = new B();
		A a = (p,q) -> System.out.println("after call for p...."+p);
		A a1 = (q,s) -> System.out.println("after call for q...."+q);
		b.show(a);
		
		
		/*
		 * new Thread(()-> { for(;;) { System.out.println("Thread rann"); try {
		 * TimeUnit.MILLISECONDS.sleep(500); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 * 
		 * }).start();
		 */
	}
}
