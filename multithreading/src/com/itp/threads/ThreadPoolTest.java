package com.itp.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		//Callable
		//service.submit(new Deposit())
		
	}
}
