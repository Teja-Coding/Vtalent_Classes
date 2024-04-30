package org.Traveler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientClass {
	

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		CarClass CarClass = context.getBean(CarClass.class);
		CarClass.moving();
		
		BikeClass bikeClass = context.getBean(BikeClass.class);
		bikeClass.moving();
		
		CycleClass cycleClass=context.getBean(CycleClass.class);
		cycleClass.moving();
	}
}
