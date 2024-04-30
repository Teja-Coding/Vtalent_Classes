package org.Traveler;

import org.springframework.stereotype.Component;

@Component("cycle")
public class CycleClass implements  Vechicle {

	public void moving() {
		// TODO Auto-generated method stub
		System.out.println("cycle is moving...");
	}

}
