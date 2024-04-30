package org.Traveler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Vechicle carVechicle() {
		return new CarClass();
		
		
	}
	@Bean
	public Vechicle bikeVechicle() {
		return new BikeClass();
		
	}
	@Bean
	public Vechicle cycleVechicle() {
		return new CycleClass();
		
	}
	
	@Bean
	public TravelerClass travelerClass() {
		return new TravelerClass(carVechicle());
	}
}
