package org.com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoClass {
	public static void main(String[] args) {
		 Vector v = new Vector<>();
		 
		 v.add("manikanta");
		 v.add(5);
		 v.add("sri");
		 v.add(1000);
		 System.out.println(v);
		 
		 System.out.println("using enumeration to iterate...");
		 Enumeration enumeration = v.elements();
		 while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
			
		}
		 
	}
}
