package com.itp.threads;

class OddThread extends Thread {
	
	@Override
	public void run() {
		// Thread logic
		for (int i = 1; i <= 100; i += 2)
			System.out.println("Odd:" + i);
	}
}

class EvenThread implements Runnable {
	@Override
	public void run() {
		// Thread logic
		for (int i = 2; i <= 100; i += 2)
			System.out.println("Even:" + i);
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		// 1. Odd Thread
		OddThread oddThread = new OddThread();
		oddThread.start(); //It will run() method
		
		//2. Even Thread
		EvenThread evenThread = new EvenThread();
		Thread t = new Thread(evenThread);
		t.start();
		
		
		/*
		 * printOddNumber();
		 * printEvenNumber();
		 */ }
}
