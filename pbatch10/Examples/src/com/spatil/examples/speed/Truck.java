package com.spatil.examples.speed;

public class Truck implements Vehicle {

	@Override
	public void applyHorns() {

		System.out.println("Applying truck horns....");
	}

	@Override
	public void applyBreaks() {
		System.out.println("Applying truck breaks....");
	}
}
