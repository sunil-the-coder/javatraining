package com.spatil.examples.ass13;

public class ArrayStack implements Stack {

	private int[] stk;
	private int top;

	public ArrayStack(int size) {
		stk = new int[size];
		top = -1;
	}

	private boolean isFull() {
		return top == stk.length - 1;
	}

	private boolean isEmpty() {
		return top == -1;
	}

	@Override
	public void push(int data) throws StackOverflowException {
		if (!isFull())
			stk[++top] = data;
		else
			throw new StackOverflowException("Stack is full. Can't push more elements....");
	}

	@Override
	public int pop() throws StackUnderflowException {
		int data = -1;

		if (!isEmpty()) {
			data = stk[top];
			top--;
		} else {
			throw new StackUnderflowException("Stack is empty. Can't pop more elements....");
		}
		return data;
	}

}
