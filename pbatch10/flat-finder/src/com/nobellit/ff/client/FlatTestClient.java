package com.nobellit.ff.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.nobellit.ff.model.Flat;
import com.nobellit.ff.model.Keys;
import com.nobellit.ff.service.FlatCostCalculatorService;

public class FlatTestClient {

	public static void main(String[] args) {
		
		List<Flat> flats = new LinkedList<>();
		flats.add(new Flat("A", 10000, 2, 15, 500));
		flats.add(new Flat("B", 12000, 1, 15, 100));
		flats.add(new Flat("C", 11000, 4, 20, 1500));

	//	int[] params = new int[] {10,5,20,25,300};
		
		Map<Keys,Integer> params = new HashMap<>();
		params.put(Keys.DISTANCE_COST, 10);
		params.put(Keys.TRAVEL_COST, 5);
		params.put(Keys.TOTAL_WORKING_DAYS, 20);
		
		
		FlatCostCalculatorService service = new FlatCostCalculatorService(flats);
		service.calculateTotalCost(params);
		
		Collections.sort(flats);
		
		
		System.out.printf("Best flat is %s having rent %d",flats.get(0).getFlatName(),flats.get(0).getTotalCost());
		
		/*
		 * for(Flat flat : flats) System.out.println(flat);
		 */
		
		//Logic
		
		
		
		
	}
}
