package com.itp.flatfinder.util;

import java.util.List;
import java.util.Map;

import com.itp.flatfinder.model.Flat;

public class FlatCostCalculator {

	// Call by Value & Call by Ref in java.
	public static void calculateTotalCost(List<Flat> flats, 
			Map<String,Integer> costParams) {
		flats.parallelStream().forEach(f -> {
			int totalCost = 0;
			totalCost += f.getRentPerMonth();
			totalCost += (f.getDistance() * costParams.get("distanceCost")) * costParams.get("totalWorkingDays");
			totalCost += (f.getTravelTime() * costParams.get("travelCost")) * costParams.get("totalWorkingDays");
			totalCost -= f.getLocationAdvantage();
			f.setTotalCost(totalCost);
		});
	}
}
