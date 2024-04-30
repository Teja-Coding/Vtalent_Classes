package com.org.ArrayListMethods;

import java.util.ArrayList;

public class indexOfMethods {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		int indexBanana = fruits.indexOf("Banana");
		System.out.println(indexBanana); // Output: 1

	}
}
