package com.spatil.examples.speed;

public class Car implements Vehicle, RemoteControllable {

	@Override
	public void applyHorns() {

		System.out.println("Applying car horns...");
	}

	@Override
	public void applyBreaks() {
		System.out.println("Applying Car breaks....");
	}

	@Override
	public void controlUsingRemote() {
		System.out.println("controlling car using remote....");
	}
}
