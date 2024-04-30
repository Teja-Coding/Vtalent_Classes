package org.com.Abstract;

public abstract  class ParentClass {
	void test() {
		System.out.println("compete method");
	}
	
	
	 abstract void demo();
}
class Child extends ParentClass{

	@Override
	void demo() {
		// TODO Auto-generated method stub
		System.out.println("completed method 2");
	}
	
}


