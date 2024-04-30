package org.com.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet ss=new TreeSet<>();
		
		for(int i=10;i<=20;i++)
			ss.add(i);
		
		System.out.println(ss);
		
		
		  System.out.println("to get first element: "+ss.first());
		  System.out.println("to get last element: "+ss.last());
		  System.out.println("to get head of the set "+ss.headSet(15));
		  System.out.println("to get tail of the set "+ss.tailSet(17));
		  System.out.println("to get sub set of the set "+ss.subSet(14, 18));
		  System.out.println("if we follow delfat natural order gives null ="+ss.
		  comparator());
		 
	}
}
