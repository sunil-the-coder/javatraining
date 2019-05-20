package com.itp.threads;

class DepositThread implements Runnable {

	//Refer to existing account object
	private Account account;

	public DepositThread(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++)
			account.deposit(500);
	}
}

class WithdrawThread implements Runnable {

	//Refer to existing account object
	private Account account;

	public WithdrawThread(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++)
			account.withdraw(500);
	}
}

public class AccountTest {

	public static void main(String[] args) {

		//Create account object
		Account joinAccount = new Account(5000);

		Thread depositThread = 
				new Thread(new DepositThread(joinAccount));
		Thread withdrawThread = 
				new Thread(new WithdrawThread(joinAccount));

		depositThread.start();
		withdrawThread.start();
		
		try {
			depositThread.join();
			withdrawThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance:"+joinAccount.getFinalBalance());
	}
}
