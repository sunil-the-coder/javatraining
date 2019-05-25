package com.itp.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

class StringSplitter implements Callable<List<String>> {

	private String str;

	public StringSplitter(String str) {
		super();
		this.str = str;
	}

	@Override
	public List<String> call() throws Exception {
		return Arrays.asList(str.split("/"));
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

		List<Future<List<String>>> futures = new ArrayList();

		// Submit any Runnable / Callable task
		for (int i = 1; i <= 10; i++) {
			Future<List<String>> future = executorService.
					submit(new StringSplitter("sunil/patil/shevate/pandharpur"));
			futures.add(future);
		}

		try {
			System.out.println("Waiting for result....");
			for (Future<List<String>> future : futures) {
				List<String> result = future.get();
				/*
				 * for(String str : result) { System.out.print(str+"/"); }
				 */
				//System.out.println();
				System.out.println("result:" + result);
			}

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		// Close the pool & clean up all threads.
		executorService.shutdown();
	}
}
