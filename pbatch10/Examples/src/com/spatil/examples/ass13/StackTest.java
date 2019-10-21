package com.spatil.examples.ass13;

public class StackTest {

	//Loosly coupled method......
	public static void doStackOperations(Stack stack) {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		for (int i = 0; i < 5; i++) {
			System.out.println("Pop:" + stack.pop());
		}

	}

	public static void main(String[] args) {
		
		int size = 5;
		
		doStackOperations(new ArrayStack(size));
		doStackOperations(new LinkedStack(size));
	}
}
