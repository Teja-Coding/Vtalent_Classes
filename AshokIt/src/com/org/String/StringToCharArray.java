package com.org.String;

public class StringToCharArray {

	public static void main(String[] args) {
		String name="manikanta";
		
		char arr[]=name.toCharArray();
		System.out.println(arr);
		System.out.println("after converting string to array");
		for(char x:arr) {
			System.out.println(x);
		}
	}
}
