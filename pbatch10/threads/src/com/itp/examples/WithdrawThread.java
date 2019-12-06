package com.itp.examples;

public class WithdrawThread implements Runnable {

	private JoinAccount joinAccount;

	public WithdrawThread(JoinAccount joinAccount) {
		super();
		this.joinAccount = joinAccount;
	}

	@Override
	public void run() {
		double amount = 2000;
		for (int i = 0; i < 10; i++) {
			//System.out.println("Withdrawing..." + amount);
			joinAccount.withdraw(amount);
		}
	}

}
