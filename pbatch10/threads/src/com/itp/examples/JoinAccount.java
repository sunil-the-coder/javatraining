package com.itp.examples;

public class JoinAccount {

	private double balance;

	public JoinAccount(double balance) {
		super();
		this.balance = balance;
	}

	public synchronized void deposit(double amount) {
		double result = 0;
		result = balance + amount;
		balance = result;
	}

	public void withdraw(double amount) {
		synchronized (this) {
			double result = 0;
			result = balance - amount;
			balance = result;	
		}
		
	}

	public double getBalance() {
		return balance;
	}

}