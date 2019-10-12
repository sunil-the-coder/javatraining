package com.itp.flatfinder.util;

import java.util.List;
import java.util.Map;

import com.itp.flatfinder.model.Flat;
import static com.itp.flatfinder.model.Keys.*;

public class FlatCostCalculator {

	public static void calculateTotalCost(List<Flat> flats, 
			Map<String, Integer> costParams) {
		flats.parallelStream().forEach(f -> {
			int totalCost = 0;
			totalCost += f.getRentPerMonth();
			totalCost += getDistanceCost(costParams, f);
			totalCost += getTravelCost(costParams, f);
			totalCost -= f.getLocationAdvantage();
			f.setTotalCost(totalCost);
		});
	}

	private static int getTravelCost(Map<String, Integer> costParams, Flat f) {
		return (f.getTravelTime() * costParams.get(TRAVEL_COST.toString())) * costParams.get(TOTAL_WORKING_DAYS.toString());
	}

	private static int getDistanceCost(Map<String, Integer> costParams, Flat flat) {
		return (flat.getDistance() * costParams.get(DISTANCE_COST.toString())) * costParams.get(TOTAL_WORKING_DAYS.toString());
	}
}
