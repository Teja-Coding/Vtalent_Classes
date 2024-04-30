package org.com;

public class ClassMain {
	public static void main(String[] args) {
		Tri t1=new Tri();
		t1.rotate();
		
		Circle c1=new Circle();
		c1.rotate();
		
		Rect r1=new Rect();
		r1.rotate();
		
	}
}
class Tri{
	public void rotate() {
		System.out.println("rotate in clock wise");
	}
}
class Circle{
	public void rotate() {
		System.out.println("rotate in clock wise");
	}
}
class Rect{
	public void rotate() {
		System.out.println("rotate in clock wise");
	}
}
