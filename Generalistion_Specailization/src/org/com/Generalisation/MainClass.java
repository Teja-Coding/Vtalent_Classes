package org.com.Generalisation;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * HeroHanda h1 = new HeroHanda(); Duke d1= new Duke(); Bullet b1=new Bullet();
		 * 
		 * h1.start(); b1.start(); d1.start();
		 */
		
		MainClass mc=new MainClass();
		mc.race(new HeroHanda());
		mc.race(new Duke());
		mc.race(new Bullet());
	}
	public void race(Bike b) {
		b.start();
	}

}
