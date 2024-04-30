package com.org.String;

public class ConcatenationString {
	
	public static void main(String[] args) {
		String name="mani";
		String name1=new String("kanta");
		System.out.println("with + operator");
		System.out.println(name+name1);
		System.out.println("with method");
		System.out.println(name.concat(name1));
	}

}
