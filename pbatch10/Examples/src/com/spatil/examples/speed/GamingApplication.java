package com.spatil.examples.speed;

import java.util.Scanner;

public class GamingApplication {

	//Loosly Coupled Method
	public static void applyOperation(Vehicle vehicle) {
		vehicle.applyBreaks();
		vehicle.applyHorns();
		
		if(vehicle instanceof Bike) {
			Bike b = (Bike) vehicle;
			b.controlUsingRemote();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1. Car");
			System.out.println("2. Bike");
			System.out.println("3. Truck");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");

			int ch = scan.nextInt();

			switch (ch) {

			case 1:
				applyOperation(new Car());
				break;
			case 2:
				applyOperation(new Bike());
				break;
			case 3:
				applyOperation(new Truck());
				break;
			case 4:
				System.exit(0);
			}

		}

	}
}
