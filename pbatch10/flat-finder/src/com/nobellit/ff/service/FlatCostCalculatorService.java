package com.nobellit.ff.service;

import java.util.List;

import com.nobellit.ff.model.Flat;

public class FlatCostCalculatorService {

	private List<Flat> flats;

	public FlatCostCalculatorService(List<Flat> flats) {
		super();
		this.flats = flats;
	}

	public void calculateTotalCost(int distanceCost, int travelCost, int totalWokingDays) {
		int totalCost = 0;
		for (Flat flat : flats) {
			totalCost = flat.getRent();
			totalCost += (flat.getDistance() * distanceCost) * totalWokingDays;
			totalCost += (flat.getTravelTime() * travelCost) * totalWokingDays;
			totalCost -= flat.getLocationAdvantage();
			flat.setTotalCost(totalCost);
		}
		
	}
	
	
	
	

}
