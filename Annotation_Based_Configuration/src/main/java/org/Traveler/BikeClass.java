package org.Traveler;

import org.springframework.stereotype.Component;

@Component("bike")
public class BikeClass implements Vechicle {

	public void moving() {
		// TODO Auto-generated method stub
		System.out.println("bike is moving....");
	}

}
