package com.nobel.model;

public class JetPlane implements Plane {

	// Tight coupling
	private Engine engine;

	public JetPlane(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void fly() {
		engine.startEngine();
		System.out.println("Plane is flying to america.....");
	}

	@Override
	public void takeOff() {
		System.out.println("Take Off in America.");
		engine.stopEngine();
	}

}
