package com.itp.flatfinder.model;

//You can use enums
public enum Keys {
	TOTAL_WORKING_DAYS("totalWorkingDays"),
	DISTANCE_COST("distanceCost"),
	TRAVEL_COST("travelCost");

	private String value;
	
	private Keys(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value;
	}
}
