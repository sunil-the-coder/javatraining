package com.psl.example;

public class Engine {

	private String made;

	public Engine(String made) {
		super();
		this.made = made;
	}

	public void startEngine() {
		System.out.println("Engine started.");
	}

	public void stopEngine() {
		System.out.println("Engine stopped.");
	}
}
