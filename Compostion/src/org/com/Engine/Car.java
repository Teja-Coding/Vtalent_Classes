package org.com.Engine;

public class Car {
	void drive ( ){
		Engine e = new Engine ( );   // HAS-A Relation
		e.start ( );
		System.out.println("Journey Started");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
	}
}
