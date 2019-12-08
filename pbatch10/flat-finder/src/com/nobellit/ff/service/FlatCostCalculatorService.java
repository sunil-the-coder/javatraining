package com.nobellit.ff.service;

import java.util.List;
import java.util.Map;

import com.nobellit.ff.model.Flat;

public class FlatCostCalculatorService {

	private List<Flat> flats;

	public FlatCostCalculatorService(List<Flat> flats) {
		super();
		this.flats = flats;
	}

	public void calculateTotalCost(Map<String, Integer> params) {
		int totalCost = 0;
		for (Flat flat : flats) {
			totalCost = flat.getRent();
			totalCost += getDistanceCost(params.get("distanceCost"), params.get("totalWorkingDays"), flat);
			totalCost += getTravelCost(params.get("travelCost"), params.get("totalWorkingDays"), flat);
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
