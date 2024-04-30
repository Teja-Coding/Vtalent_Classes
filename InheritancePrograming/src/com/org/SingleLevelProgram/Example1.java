package com.org.SingleLevelProgram;

public class Example1 {
	
	public void test() {
		System.out.println("hi iam parent class object");
	}
}

class ChildClass extends Example1{
	
	public void childMethod() {
		System.out.println("iam child class method");
	}
	
}
class ChildClass2 extends ChildClass{
	public void childClass2() {
		System.out.println("hi iam form child 2");
	}
}
