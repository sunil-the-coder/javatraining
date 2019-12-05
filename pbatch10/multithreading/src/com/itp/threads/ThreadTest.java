package com.itp.threads;

class OddThread extends Thread {

	@Override
	public void run() {
		// Thread logic
		System.out.println(Thread.currentThread());
		for (int i = 1; i <= 100; i += 2)
			System.out.println("Odd:" + i);
	}
}

class EvenThread implements Runnable {
	@Override
	public void run() {
		// Thread logic
		System.out.println(Thread.currentThread());
		for (int i = 2; i <= 100; i += 2)
			System.out.println("Even:" + i);
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("Inside main()");
		
		Thread currentThread = Thread.currentThread();
		
		System.out.println(currentThread);
		
		
		// 1. Odd Thread
		OddThread oddThread = new OddThread();
		oddThread.setName("oddThread");
		oddThread.start(); // It will run() method

		// 2. Even Thread
		EvenThread evenThread = new EvenThread();
		Thread t = new Thread(evenThread);
		t.setName("evenThread");
		t.start();
		
		System.out.println("Exiting from main");
	}

}
