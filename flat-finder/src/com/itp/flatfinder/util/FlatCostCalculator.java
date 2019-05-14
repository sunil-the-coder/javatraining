package com.itp.flatfinder.util;

import java.util.List;

import com.itp.flatfinder.model.Flat;

public class FlatCostCalculator {

	// Call by Value & Call by Ref in java.
	public static void calculateTotalCost(List<Flat> flats, int distanceCost, 
			int travelCost, int totalWorkingDays) {
		flats.parallelStream().forEach(f->{
			int totalCost = 0;
			totalCost += f.getRentPerMonth();
			totalCost += (f.getDistance() * distanceCost) * totalWorkingDays;
			totalCost += (f.getTravelTime() * travelCost) * totalWorkingDays;
			totalCost -= f.getLocationAdvantage();
			f.setTotalCost(totalCost);
		});
	} 
}
