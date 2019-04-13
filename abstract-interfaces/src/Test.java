import java.util.Scanner;

import com.troyhunt.model.Bike;
import com.troyhunt.model.Car;
import com.troyhunt.model.Vehicle;

public class Test {

	//Loosly coupled code
	public static void doOperation(Vehicle vehicle) {
		vehicle.applyBreaks();
		vehicle.applyHorns();
	}

	public static void main(String[] args) {

		
		doOperation(new Bike());
		doOperation(new Car());
		
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("1. Car");
			System.out.println("2. Bike");
			System.out.println("3. Exit");

			System.out.println("Enter choice:");
			int choice = scan.nextInt();

			Vehicle vehicle = null;

			switch (choice) {

			case 1:
				vehicle = new Car();
				break;
			case 2:
				vehicle = new Bike();
				break;
			default:
				scan.close();

				System.exit(0);
			}

			vehicle.applyBreaks();
			vehicle.applyHorns();

		}
	}
}
