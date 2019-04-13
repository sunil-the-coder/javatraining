import java.util.Scanner;

import com.troyhunt.model.Bike;
import com.troyhunt.model.Car;
import com.troyhunt.model.RemoteControllable;
import com.troyhunt.model.Vehicle;

public class Test {

	// Loosly coupled code
	public static void doOperation(Vehicle vehicle) {
		vehicle.applyBreaks();
		vehicle.applyHorns();

		if (vehicle instanceof RemoteControllable) {
			RemoteControllable remote = (RemoteControllable) vehicle;
			remote.controlUsingRemote();
		}

	}

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("1. Car");
			System.out.println("2. Bike");
			System.out.println("3. Exit");

			System.out.println("Enter choice:");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				doOperation(new Car());
				break;
			case 2:
				doOperation(new Bike());
				break;
			default:
				scan.close();
				System.exit(0);
			}

		}
	}
}
