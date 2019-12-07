package threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumCalculatorThread implements Callable<Integer> {

	private int number;

	public SumCalculatorThread(int number) {
		super();
		this.number = number;
	}

	@Override
	public Integer call() {

		int total = 0;
		for (int i = 1; i <= number; i++)
			total += i;
		
		return total;
		//System.out.println(total);
	}
}

public class ThreadApp {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		Future<Integer> future = executorService.submit(new SumCalculatorThread(5));
		
		try {
			//get -> Blocking method - It will wait till complete execution of the thread.
			System.out.println("Result:"+future.get());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		//You should close service to destroy call threads in pool.
		List<Runnable> pendingTasks = executorService.shutdownNow();
		
		
		
		
		
		
		
		
		
		
		
	}
}
