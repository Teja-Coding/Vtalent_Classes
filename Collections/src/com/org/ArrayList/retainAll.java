package com.org.ArrayList;

import java.util.ArrayList;

public class retainAll {

		 public static void main(String[] args) {
		      ArrayList<String> list1 = new ArrayList<>();
		      ArrayList<String> list2 = new ArrayList<>();
		      ArrayList<String> list3 = new ArrayList<>();

		      list1.add("apple");
		      list1.add("banana");
		      list1.add("cherry");
		      list1.add("date");

		      list2.add("banana");
		      list2.add("date");
		      list2.add("elderberry");
		      list2.add("fig");
		      
		      

		      System.out.println("List 1 before retainAll(): " + list1);
		      System.out.println("List 2 before retainAll(): " + list2);

		      list1.retainAll(list2);

		      System.out.println("List 1 after retainAll(): " + list1);
//		      
//		      list3.addAll(list1);
//		      System.out.println(list3);
		      
		      for(Object object:list1) {
		    	  System.out.println(object);
		      }
	
		   }
		}
	
	
