package org.com.Car;

public class Drive {
	public String name;
	public Car car;
	public Drive(Car car,String name) {
		super();
		this.car = car;
		this.name = name;
	}
	public void drive() {
		car.start();
		car.move();
		car.stop();
	}
	public static void main(String[] args) {
		Drive drive=new Drive(new Car(), "nana");
		drive.drive();
	}
}