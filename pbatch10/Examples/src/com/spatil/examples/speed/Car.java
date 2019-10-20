package com.spatil.examples.speed;

public class Car implements Vehicle {

	@Override
	public void applyHorns() {

		System.out.println("Applying car horns...");
	}

	@Override
	public void applyBreaks() {
		System.out.println("Applying Car breaks....");
	}
}
