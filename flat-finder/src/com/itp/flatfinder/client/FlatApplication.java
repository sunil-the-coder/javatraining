package com.itp.flatfinder.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itp.flatfinder.model.Flat;
import com.itp.flatfinder.util.FlatCostCalculator;

public class FlatApplication {

	public static void main(String[] args) {
		
		List<Flat> flats = new ArrayList<>();
		flats.add(new Flat("A", 10000, 2, 15, 500));
		flats.add(new Flat("B", 12000, 1, 15, 100));
		flats.add(new Flat("C", 11000, 4, 20, 1500));
		
		Map<String,Integer> costParams = new HashMap();
		costParams.put("totalWorkingDays",20);
		costParams.put("distanceCost",10);
		costParams.put("travelCost",5);
		costParams.put("travelCost",5);
		
		FlatCostCalculator.calculateTotalCost(flats, costParams);
		
		flats.forEach(f-> {
			System.out.println(f.getName()+"\t"+f.getTotalCost());
		});
		
	}
	
}
