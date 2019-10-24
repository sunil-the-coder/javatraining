package com.spatil.examples.ass13;

public interface Stack {
	void push(int data) throws StackOverflowException;

	int pop() throws StackUnderflowException;
}
