package org.com.RectangleConstructor;

public class RectanleClass {
	public double length,width;

	public RectanleClass(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void areaOfRectangle() {
		System.out.println("length of reactangle: "+length);
		System.out.println("width of reactangle: "+width);
		System.out.println("Area of reactangle is: "+length*width);
	}
}
