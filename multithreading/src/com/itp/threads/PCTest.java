package com.itp.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;

	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		for (int i = 10; i <= 100; i++) {

			try {
				this.sharedQueue.put(i);
				Thread.sleep(500);
				System.out.println("Produced: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;

	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			Integer item  = null;
			while ((item = this.sharedQueue.take()) != 100) {
				Thread.sleep(500);
				System.out.println("Consumed: " + item);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class PCTest {

	public static void main(String[] args) {

		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue(5);

		Thread producer = new Thread(new Producer(sharedQueue));
		Thread consumer = new Thread(new Consumer(sharedQueue));

		producer.start();
		consumer.start();

		/*
		 * try { producer.join(); consumer.join(); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

	}
}
