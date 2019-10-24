package com.spatil.examples.ass13;

import javax.swing.JOptionPane;

public class StackTest {

	// Loosly coupled method......
	public static void doStackOperations(Stack stack) {

		try {
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			//stack.push(60);
			
			for (int i = 0; i < 6; i++) {
				System.out.println("Pop:" + stack.pop());
			}
		} catch (StackOverflowException e) {
			//System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());

		} catch (StackUnderflowException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		int size = 5;

		doStackOperations(new ArrayStack(size));
		//doStackOperations(new LinkedStack(size));
	}
}
