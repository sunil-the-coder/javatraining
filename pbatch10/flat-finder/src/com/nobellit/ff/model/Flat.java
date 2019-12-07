package com.nobellit.ff.model;

public class Flat implements Comparable<Flat> {
	private String flatName;
	private int rent;
	private int distance;
	private int travelTime;
	private int locationAdvantage;

	public Flat(String flatName, int rent, int distance, int travelTime, int locationAdvantage) {
		super();
		this.flatName = flatName;
		this.rent = rent;
		this.distance = distance;
		this.travelTime = travelTime;
		this.locationAdvantage = locationAdvantage;
	}

	private int totalCost;

	public String getFlatName() {
		return flatName;
	}

	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
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

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Flat [flatName=" + flatName + ", rent=" + rent + ", distance=" + distance + ", travelTime=" + travelTime
				+ ", locationAdvantage=" + locationAdvantage + ", totalCost=" + totalCost + "]";
	}
	
	@Override
	public int compareTo(Flat f2) {
		return this.totalCost - f2.getTotalCost();
	}

}
