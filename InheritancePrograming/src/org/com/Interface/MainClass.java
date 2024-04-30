package org.com.Interface;

public class MainClass implements Child {

	
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("demo method completed");
	}


	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("demo1 method");
	}


	public void demo3() {
		// TODO Auto-generated method stub
		System.out.println("demo3");
		
	}
	public static void main(String[] args) {
		MainClass mc =new MainClass();
		mc.demo();
		mc.demo1();
		mc.demo3();
	}
	
}