package com.org.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectonsClassExample {
	public static void main(String[] args) {
		ArrayList ts=new ArrayList<>();
		
		ts.add(new StudentClass(101,"mani", 200));
		ts.add(new StudentClass(102,"yuva", 300));
		ts.add(new StudentClass(103,"teja", 500));
		ts.add(new StudentClass(104,"uma", 600));
		ts.add(new StudentClass(105,"mounika", 900));
		
		//System.out.println(ts);
		
		Collections.sort(ts);
		System.out.println(ts);
	}
}