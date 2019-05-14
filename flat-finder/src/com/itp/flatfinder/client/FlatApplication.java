package com.itp.flatfinder.client;

import java.util.ArrayList;
import java.util.List;

import com.itp.flatfinder.model.Flat;
import com.itp.flatfinder.util.FlatCostCalculator;

public class FlatApplication {

	public static void main(String[] args) {
		
		List<Flat> flats = new ArrayList<>();
		flats.add(new Flat("A", 10000, 2, 15, 500));
		flats.add(new Flat("B", 12000, 1, 15, 100));
		flats.add(new Flat("C", 11000, 4, 20, 1500));
		
		FlatCostCalculator.calculateTotalCost(flats, 10, 5, 20);
		
		flats.forEach(f-> {
			
			System.out.println(f.getName()+"\t"+f.getTotalCost());
		});
		
	}
	
}
