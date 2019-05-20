package com.itp.threads;

public class Account {

	// state of the object
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("After Deposit:" + this.balance);
	}

	public void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("Insufficient Balance to withraw");
		}

		this.balance -= amount;
		System.out.println("After Withdraw:" + this.balance);
	}

	public int getFinalBalance() {
		return balance;
	}
}
