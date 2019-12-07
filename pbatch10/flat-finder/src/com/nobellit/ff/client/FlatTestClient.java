package com.nobellit.ff.client;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.nobellit.ff.model.Flat;
import com.nobellit.ff.service.FlatCostCalculatorService;

public class FlatTestClient {

	public static void main(String[] args) {
		
		List<Flat> flats = new LinkedList<>();
		flats.add(new Flat("A", 10000, 2, 15, 500));
		flats.add(new Flat("B", 12000, 1, 15, 100));
		flats.add(new Flat("C", 11000, 4, 20, 1500));

		FlatCostCalculatorService service = new FlatCostCalculatorService(flats);
		service.calculateTotalCost();
		
		Collections.sort(flats);
		
		
		System.out.printf("best flat is %s having rent %d",flats.get(0).getFlatName(),flats.get(0).getTotalCost());
		
		/*
		 * for(Flat flat : flats) System.out.println(flat);
		 */
		
		//Logic
		
		
		
		
	}
}
