package com.itp.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Runnable {

	@Override
	public void run() {
		for (;;) {
			System.out.println(Thread.currentThread().getName() + " Working....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class StringSplitter implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Dummy String";
	}
}

public class ThreadPoolTest {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		// Get no of processors on current machine
		int processors = runtime.availableProcessors();

		System.out.println(processors);

		// Prepare service based on thread model.
		ExecutorService executorService = Executors.newFixedThreadPool(processors * 2);

		// Submit any Runnable / Callable task
		Future<String> future = executorService.
				submit(new StringSplitter());

		try {
			System.out.println("Waiting for result....");
			String result = future.get();
			System.out.println("result:"+result);

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		// Close the pool & clean up all threads.
		executorService.shutdown();
	}
}
