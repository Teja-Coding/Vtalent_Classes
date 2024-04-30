package com.org.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class addAllMethod {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		list1.add("apple");
		list1.add("banana");
		list1.add("orange");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("grape");
		list2.add("kiwi");
		list2.add("watermelon");

		ArrayList<String> list3 = new ArrayList<>();
		
		  
		  list1.addAll(list2);
		  
		  System.out.println(list1);
		 

		list3.addAll(list1);
		System.out.println(list3);

	}
}
