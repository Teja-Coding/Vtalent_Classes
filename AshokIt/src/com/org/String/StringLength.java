package com.org.String;

public class StringLength {
	
	public static void main(String[] args) {
		String str="manikanta";
		System.out.println("length of the string is: ");
		System.out.println(str.length());
		System.out.println("-----------------------");
		System.out.println("with logic: ");
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			count++;
		}
		System.out.println("length is: "+count);
	}

}
