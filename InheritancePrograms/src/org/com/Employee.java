package org.com;

public class Employee extends User {
	Employee(){
		System.out.println("child class constroter..");
	}
	void m2() {
		System.out.println("child class m2 method is called");
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.m1();
		emp.m2();
	}
}
