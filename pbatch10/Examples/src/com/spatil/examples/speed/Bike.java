package com.spatil.examples.speed;

public class Bike extends Vehicle {
	
	@Override
	public void applyBreaks() {

		System.out.println("Applying bike breaks....");
	}

	@Override
	public void applyHorns() {
		System.out.println("Applying bike horns....");
	}
}
