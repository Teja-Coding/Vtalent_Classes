package com.tightCoupling;

public class Traveler {

	private Vehicle vehicle;
	
	public Traveler(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	
	public void startJourney() {
		this.vehicle.move();
	}
}