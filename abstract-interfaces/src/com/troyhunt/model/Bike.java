package com.troyhunt.model;

public class Bike implements Vehicle, RemoteControllable {

	@Override
	public void applyBreaks() {
		System.out.println("Applying bike breaks..");
	}

	@Override
	public void applyHorns() {

		System.out.println("Applying bike horns");
	}

	@Override
	public void controlUsingRemote() {
		System.out.println("Controlling bike using remote");
	}
}
