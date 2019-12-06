package com.itp.examples;

public class DepositThread implements Runnable {

	private JoinAccount joinAccount;

	public DepositThread(JoinAccount joinAccount) {
		super();
		this.joinAccount = joinAccount;
	}

	@Override
	public void run() {
		double amount = 2000;	
		for (int i = 0; i < 10; i++) {
		//	System.out.println("Depositing..." + amount);
			joinAccount.deposit(amount);
		}
	}

}
