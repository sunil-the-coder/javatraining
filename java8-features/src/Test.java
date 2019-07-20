@FunctionalInterface // ( can't declare multiple methods inside functional interface)
interface A {
	void disp(int x);
}

/*
 * class C implements A { public void disp() {
 * System.out.println("C disp called..."); } }
 */

class B {
	public void show(A a) {
		a.disp(10);
	}
}

/*
 * class OddThread implements Runnable {
 * 
 * @Override public void run() { for(;;) {
 * System.out.println("Odd thread running...."); } } }
 */

@FunctionalInterface
interface Calculator {
	int add(int x, int y);
}

public class Test {

	public static void main(String[] args) {

		Calculator c = (x, y) -> x + y;
		Calculator c1 = (int x, int y) -> x + y;
		
		int sum = c.add(10, 20);
		System.out.println("Sum is:" + sum);

		/*
		 * Runnable runnable = new Runnable() {
		 * 
		 * @Override public void run() { for(;;) {
		 * System.out.println("Odd thread running...."); } } };
		 */

		/*
		 * Runnable runnable = () -> { for (;;) {
		 * System.out.println("Odd thread running...."); } };
		 */

		Thread t1 = new Thread(() -> {
			for (;;) {
				System.out.println("Odd thread running....");
			}
		});

		// t1.start();

		B b = new B();
		
		A a = p -> System.out.println("after call for p...." + p);

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
