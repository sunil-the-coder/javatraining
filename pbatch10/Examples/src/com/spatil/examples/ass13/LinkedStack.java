package com.spatil.examples.ass13;

public class LinkedStack implements Stack {

	public LinkedStack(int size) {
	}

	private boolean isFull() {
		return false;
	}

	private boolean isEmpty() {
		return false;
	}

	@Override
	public void push(int data) {
		System.out.println("Eleement pushed to list");
	}

	@Override
	public int pop() {
		System.out.println("Element removed from list..");
		return 10;
	}

}
