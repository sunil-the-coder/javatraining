package com.itp.threads;

class Odd implements Runnable {

	@Override
	public void run() {
		// Thread logic
		printOddNumbers();
	}

	public void printOddNumbers() {
		for (int i = 1; i <= 100; i += 2)
			System.out.println("Odd:" + i);
	}
}

class Even extends Thread {

	@Override
	public void run() {
		printEvenNumbers();
	}

	public void printEvenNumbers() {
		for (int i = 2; i <= 100; i += 2)
			System.out.println("Even:" + i);
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		Thread currentThread = Thread.currentThread();
		currentThread.setName("sunil");
		currentThread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(currentThread);
		
		System.out.println("Main method end");
		
	}
}
