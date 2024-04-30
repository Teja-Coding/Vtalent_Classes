package com.app.org.DocterObject;

//Take Docter class with docterName, docterAge  as properties
//Create Driver class with print ( ) method to print Docter data
public class DriverClass {
	public static void main(String[] args) {
		DriverClass dc = new DriverClass();
		DocterClass dc1 = new DocterClass();
		
		dc1.DocterName="naveen";
		dc1.age=56;
		
		dc.print(dc1);
		
	}
	void print(DocterClass d) {
		System.out.println("name of the docter "+d.DocterName);
		System.out.println("docter age is "+d.age);
	}
}
