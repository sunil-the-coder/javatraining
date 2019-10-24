package com.spatil.exception;

class InvalidAccountException extends Exception {
	public InvalidAccountException(String message) {
		super(message);
	}
}

public class TestException {

	public static void main(String[] args) {

		int acno = 100;
		
		try {
			if(acno == 100) {
				//InvalidAccountException e = new InvalidAccountException("Invalid account number..");
				throw new InvalidAccountException("Invalid account number..");
			}
			System.out.println("Valid Account number");
		} catch (InvalidAccountException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}
