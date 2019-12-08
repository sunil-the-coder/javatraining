package com.nobellit.ff.service;

import java.util.List;
import java.util.Map;

import com.nobellit.ff.model.Flat;
import com.nobellit.ff.model.Keys;

public class FlatCostCalculatorService {

	private List<Flat> flats;

	public FlatCostCalculatorService(List<Flat> flats) {
		super();
		this.flats = flats;
	}

	public void calculateTotalCost(Map<Keys, Integer> params) {
		int totalCost = 0;
		for (Flat flat : flats) {
			totalCost = flat.getRent();
			totalCost += getDistanceCost(params.get(Keys.DISTANCE_COST), params.get(Keys.TOTAL_WORKING_DAYS), flat);
			totalCost += getTravelCost(params.get(Keys.TRAVEL_COST), params.get(Keys.TOTAL_WORKING_DAYS), flat);
			totalCost -= flat.getLocationAdvantage();
			flat.setTotalCost(totalCost);
		}

	}

	private int getTravelCost(int travelCost, int totalWokingDays, Flat flat) {

		return (flat.getTravelTime() * travelCost) * totalWokingDays;
	}

	private int getDistanceCost(int distanceCost, int totalWokingDays, Flat flat) {

		return (flat.getDistance() * distanceCost) * totalWokingDays;
	}

}
