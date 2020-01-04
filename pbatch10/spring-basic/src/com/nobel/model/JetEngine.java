package com.nobel.model;

public class JetEngine implements Engine {

	private String fuelType;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public void startEngine() {
		System.out.println("Engine is started using fuelType " + fuelType);
	}

	@Override
	public void stopEngine() {
		System.out.println("Engine is Stopped.");
	}

}
