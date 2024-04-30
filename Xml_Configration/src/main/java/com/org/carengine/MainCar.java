package com.org.carengine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCar {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Car.xml");
		Car bean1 = applicationContext.getBean("car",Car.class);
		System.out.println(bean1.hashCode());
		
		Car bean2 = applicationContext.getBean("car",Car.class);
		System.out.println(bean2.hashCode());
	}

}
