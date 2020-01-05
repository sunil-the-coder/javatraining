package com.nobel.model;

import java.util.List;

public class JetPlane implements Plane {

	// Tight coupling
	private Engine engine;

	private List<Passenger> passengerNames;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Passenger> getPassengerNames() {
		return passengerNames;
	}

	public void setPassengerNames(List<Passenger> passengerNames) {
		this.passengerNames = passengerNames;
	}

	public JetPlane() {
	}

	public JetPlane(Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void fly() {
		engine.startEngine();
		System.out.println("Plane is flying to america with these passagers " + passengerNames);
	}

	@Override
	public void takeOff() {
		System.out.println("Take Off in America.");
		engine.stopEngine();
	}

}
