package com.org.Traveller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {
	

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Traveler.xml");
		TravelerClass bean = context.getBean("t",TravelerClass.class);
		bean.startJourney();
		
		
		
	}
}
