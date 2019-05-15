package com.itp.flatfinder.util;

import java.util.List;
import java.util.Map;

import com.itp.flatfinder.model.Flat;
import com.itp.flatfinder.model.Keys;

public class FlatCostCalculator {

	public static void calculateTotalCost(List<Flat> flats, Map<String, Integer> costParams) {
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
		return (f.getTravelTime() * costParams.get(Keys.TRAVEL_COST)) * costParams.get(Keys.TOTAL_WORKING_DAYS);
	}

	private static int getDistanceCost(Map<String, Integer> costParams, Flat flat) {
		return (flat.getDistance() * costParams.get(Keys.DISTANCE_COST)) * costParams.get(Keys.TOTAL_WORKING_DAYS);
	}
}
