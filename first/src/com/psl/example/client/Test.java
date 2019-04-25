package com.psl.example.client;

import java.io.IOException;

class InsuffientBalanceException extends Exception {

	public InsuffientBalanceException(String message) {
		super(message);
	}
}

public class Test {

	public static void transact(int balance) throws InsuffientBalanceException {
		if (balance < 1000) {
			throw new InsuffientBalanceException("Balance is not sufficient");
		} else {
			balance = balance - 500;
		}

		System.out.println("Balance:" + balance);
	}

	public static void main(String[] args) {

		int balance = 900;

		try {
			transact(balance);
		} catch (InsuffientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}
}
