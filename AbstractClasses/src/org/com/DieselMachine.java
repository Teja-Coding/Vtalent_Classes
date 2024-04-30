package org.com;

public abstract class DieselMachine {
	public DieselMachine() {
		System.out.println("DieselMachine-Constructor");
	}

	public void start() {
		System.out.println("Machine starting....");
		
	}

	public abstract void fillFuel();
}
