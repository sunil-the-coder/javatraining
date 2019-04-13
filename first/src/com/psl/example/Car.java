package com.psl.example;

public class Car {

	private String model;
	private Engine engine;

	public Car(String model, Engine engine) {
		super();
		this.model = model;
		this.engine = engine;
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.startEngine();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Driving car........");

		engine.stopEngine();
	}
}
