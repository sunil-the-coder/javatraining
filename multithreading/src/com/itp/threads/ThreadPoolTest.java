package com.itp.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

	@Override
	public void run() {
		for (;;) {
			System.out.println("Working....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadPoolTest {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.submit(new Task());
		
		//Close the pool & clean up all threads.
		executorService.shutdown();
	}
}
