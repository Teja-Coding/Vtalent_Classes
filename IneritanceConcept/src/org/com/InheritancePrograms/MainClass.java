package org.com.InheritancePrograms;

public class MainClass {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.rotate();
		
		Triangle t1= new Triangle();
		t1.rotate();
		
		Reactangle r1=new Reactangle();
		r1.rotate();
	}
}
class shape{
	 public void rotate() {
		System.out.println("rotate in clock wise");//parent class
	}
}
class Circle extends shape{
	
}
class Triangle extends shape{
	public void rotate() {
		System.out.println("rotate in anti clock wise");
	}
	
}
class Reactangle extends shape{
	
}
