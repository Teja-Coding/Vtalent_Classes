package InstanceMethods;
//wap a program to create 2 non static methods and call from method..
public class Create2InstanceMethods {
	public static void main(String[] args) {
		Create2InstanceMethods c1=new Create2InstanceMethods();
		System.out.println("main starts");
		c1.climb();
		c1.drive();
		System.out.println("main ends");
	}
	//instance method with out parameters.
	void climb() {
		System.out.println("climb the hill");
	}
	void drive() {
		System.out.println("drive the car");
	}

}
