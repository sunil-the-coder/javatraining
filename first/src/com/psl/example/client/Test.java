package com.psl.example.client;

import com.psl.example.Car;
import com.psl.example.Date;
import com.psl.example.Engine;
import com.psl.example.Student;

public class Test {

	public static void main(String[] args) {
		/*
		 * Date dob = new Date(20, 4, 2000); dob.plusDays(4);
		 * 
		 * Student stud = new Student(10, "Sunil", "268296"); stud.setDate(dob);
		 * 
		 * System.out.println(stud);
		 */

		Engine engine = new Engine("Abc");

		Car car = new Car("Ferrari",engine);
		//car.setEngine(engine);
		car.drive();
	}
}
