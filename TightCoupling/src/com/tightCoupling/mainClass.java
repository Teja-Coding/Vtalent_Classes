package com.tightCoupling;

public class mainClass {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Bike();
		Traveler traveler = new Traveler(vehicle);
		
		traveler.startJourney();
		
	}
}
