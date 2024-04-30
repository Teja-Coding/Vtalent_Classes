package com.org.StudentArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoClass {
	public static void main(String[] args) {
		ArrayList<StudentArrayList> al=new ArrayList<>();
		
		al.add(new StudentArrayList(1, "mani"));
		al.add(new StudentArrayList(2, "yuva"));
		al.add(new StudentArrayList(3, "teja"));
		al.add(new StudentArrayList(4, "sri"));
		
		ListIterator<StudentArrayList> listIterator=al.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("===========================");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
	
}
