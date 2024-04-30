package org.com;

public class Machine extends DieselMachine {


	public Machine() {
		System.out.println("Machine Constructor");
	}
	
	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("filling fuel tank....");
	}
	public static void main(String[] args) {
		Machine m = new Machine();
		m.fillFuel();
		m.start();
	}
}