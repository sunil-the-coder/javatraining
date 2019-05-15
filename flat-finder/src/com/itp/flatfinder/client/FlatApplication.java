package com.itp.flatfinder.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itp.flatfinder.model.Flat;

//Java 5 Feature - static import ( Use direct static methods from other class
//rather than specifying class/interface names )
import static com.itp.flatfinder.model.Keys.*;
import static com.itp.flatfinder.util.FlatCostCalculator.*;

public class FlatApplication {

	public static void main(String[] args) {

		List<Flat> flats = new ArrayList<>();
		flats.add(new Flat("A", 10000, 2, 15, 500));
		flats.add(new Flat("B", 12000, 1, 15, 100));
		flats.add(new Flat("C", 11000, 4, 20, 1500));

		Map<String, Integer> costParams = new HashMap();
		costParams.put(TOTAL_WORKING_DAYS, 20);
		costParams.put(DISTANCE_COST, 10);
		costParams.put(TRAVEL_COST, 5);

		calculateTotalCost(flats, costParams);

		flats.forEach(f -> {
			System.out.println(f.getName() + "\t" + f.getTotalCost());
		});

	}

}
