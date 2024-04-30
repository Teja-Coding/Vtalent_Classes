package com.org.String;

public class NewKeyWordString {
	
	public static void main(String[] args) {
		String name=new String("manikanta");
		
		String name1=new String("manikanta");
		
		String name2="manikanta";
		
		
		System.out.println("----------------------");
		System.out.println("when we use to compare the string with equals");
		System.out.println(name == name1);
		System.out.println(name.equals(name1));
		System.out.println(name == name2);
	}

}
