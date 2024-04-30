package org.com.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

/*In Java, the containsAll() method is used to check whether a
 * collection contains all the elements of another collection or not. 
 * This method is a part of the Collection interface and is inherited by 
 * all its subclasses like List, Set, and Queue.

Here's an example program that demonstrates the use of the containsAll() method on a Set:

*/

public class ContainsAllMethods {
	public static void main(String[] args) {
		Set<Integer > set1=new HashSet<>();
		HashSet<Integer > set2=new HashSet<>();

	      set1.add(1);
	      set1.add(2);
	      set1.add(3);
	      set1.add(4);
	      set1.add(5);

	      set2.add(2);
	      set2.add(4);
	      set2.add(6);

	      System.out.println("set1: " + set1);
	      System.out.println("set2: " + set2);

	      boolean containsAll = set1.containsAll(set2);

	      System.out.println("set1 contains all elements of set2: " + containsAll);
	   }
	}
