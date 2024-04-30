package org.com.constructor.WithMethods;

public class Car {
	public static String company="Tata";
	public String series;
	public int speed;
	public int time;
	public Car(String series, int speed, int time) {
		this.series = series;
		this.speed = speed;
		this.time = time;
	}
	public void name() {
		System.out.println(company+"----"+series);
		System.out.println("moves of a speed is: "+speed+" kmph");
		System.out.println("travel time is: "+time+" hrs");
		System.out.println("distance coverd is: "+(speed*time)+"kms");
		System.out.println("--------------------------------------------");
	}
	
}
