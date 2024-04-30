package org.com.constructor;

public class ParameterizedConstructor {
	ParameterizedConstructor(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor(50, 90);
	}
}
