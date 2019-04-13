package com.troyhunt.model;

public class Car implements Vehicle {

	@Override
	public void applyBreaks() {

		System.out.println("Applying car breaks");
	}

	@Override
	public void applyHorns() {
		System.out.println("Applying car horns..");
	}

}
