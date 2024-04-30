package org.Traveler;

import org.springframework.stereotype.Component;

@Component("car")
public class CarClass implements Vechicle {

	public void moving() {
		// TODO Auto-generated method stub
		System.out.println("car is moving.....");
	}

}
