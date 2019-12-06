package com.itp.examples;

public class JoinAccountTest {

	public static void main(String[] args) {

		JoinAccount joinAccount = new JoinAccount(50000);

		Thread depositThread = new Thread(new DepositThread(joinAccount));
		Thread withdrawThread = new Thread(new WithdrawThread(joinAccount));
		Thread withdrawThread2 = new Thread(new WithdrawThread(joinAccount));
		
		depositThread.start();
		withdrawThread.start();
		withdrawThread2.start();
		
		try {
			depositThread.join();
			withdrawThread.join();
			withdrawThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance:"+joinAccount.getBalance());
		
	}
}
