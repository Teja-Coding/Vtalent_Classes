package com.org.Traveller;

public class TravelerClass {
	private Vechicle vechicle;
	
	
	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}


	public void startJourney() {
		this.vechicle.moving(); 
	}
}
