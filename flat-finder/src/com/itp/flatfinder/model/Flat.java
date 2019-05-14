package com.itp.flatfinder.model;

public class Flat {

	private String name;
	private int rentPerMonth;
	private int distance;
	private int travelTime;
	private int locationAdvantage;
	private int totalCost;

	public Flat(String name, int rentPerMonth, int distance, int travelTime, int locationAdvantage) {
		super();
		this.name = name;
		this.rentPerMonth = rentPerMonth;
		this.distance = distance;
		this.travelTime = travelTime;
		this.locationAdvantage = locationAdvantage;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRentPerMonth() {
		return rentPerMonth;
	}

	public void setRentPerMonth(int rentPerMonth) {
		this.rentPerMonth = rentPerMonth;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}

	public int getLocationAdvantage() {
		return locationAdvantage;
	}

	public void setLocationAdvantage(int locationAdvantage) {
		this.locationAdvantage = locationAdvantage;
	}

}
