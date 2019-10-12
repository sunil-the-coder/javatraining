package com.itp.threads;

class Odd implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		printOddNumbers();
	}

	public void printOddNumbers() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println("Odd:" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Even extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		printEvenNumbers();
	}

	public void printEvenNumbers() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println("Even:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		Thread currentThread = Thread.currentThread();
		//currentThread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(currentThread);
		
		Thread evenThread = new Thread(new Even());
		evenThread.setName("even");
		evenThread.start();
		
		Thread oddThread = new Thread(new Odd(),"odd");
		oddThread.start();
		
		try {
			//main thread wait till complete execution of even
			evenThread.join();
			oddThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method end");
		
	}
}
