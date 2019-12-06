package threads;

class MyThread implements Runnable {

	public void run() {
		int i = 1;
		for (; i <= 100; i+=2) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("in main");

		System.out.println(Thread.currentThread());

		Thread t = new Thread(new MyThread());
		t.start();

		
		try {
			t.join(); // wait till complete execution of t thread.
			//then calling thread can start their execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("exit from main");
	}
}
