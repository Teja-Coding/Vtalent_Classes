package org.Traveler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("traveler")
public class TravelerClass {
	private Vechicle vechicle;
	@Autowired
	public TravelerClass(@Qualifier("car") Vechicle vechicle) {
		super();
		this.vechicle = vechicle;
	}
	
	public void startJourney() {
		this.vechicle.moving(); 
	}
}
