package org.com.Inh;

public class Shape {
	public static void main(String[] args) {
		Tri t1=new Tri();
		t1.rotate();
		
		Circle c1=new Circle();
		c1.rotate();
		
		Rect r1=new Rect();
		r1.rotate();
	}
    void rotate() {
    	System.out.println("rotate in clock wise");
    }
}
class Tri extends Shape{
	
}
class Circle extends Shape{
	
}
class Rect extends Shape{
	void rotate() {
		System.out.println("rotate in anti clock wise");
	}
}
