package com.itp.threads;

class Odd implements Runnable {
	
	@Override
	public void run() {
		//Thread logic
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

		//1. Launching threads which implements Runnable
		Odd odd = new Odd();
		Thread oddThread = new Thread(odd);
		oddThread.start(); //It will ask thread scheduler to start the execution of thread

		//2. By using extends Thread
		Even even = new Even();
		even.start();
	}
}









