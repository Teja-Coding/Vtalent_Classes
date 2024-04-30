package org.com.constructor;

public class Circle {
	public static void main(String[] args) {
		Circle c1=new Circle(5);
		c1.Radius();
	}
	public int radius;
	public static double pi=3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
	void Radius() {
		System.out.println("radius of the circle "+pi*radius*radius);
	}
}
