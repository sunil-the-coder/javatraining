package com.itp.threads;

class Odd extends Thread {
	
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

		Odd odd = new Odd();
		odd.start(); //It will ask thread scheduler to start the execution of thread
		
		//odd.printOddNumbers();

		Even even = new Even();
		even.start();
		//even.printEvenNumbers();
	}
}
