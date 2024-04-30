package com.org.LinkedList.methods;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListexp3 {
	public static void main(String[] args) {
		 // Create a new LinkedList object
        LinkedList<String> list = new LinkedList<String>();

        // Add some elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Print the list
        System.out.println("List after adding elements: " + list);

        // Create an iterator for the list and print its elements
        Iterator<String> iterator = list.iterator();
        System.out.print("List elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // Add an element to the list while iterating
        iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("banana")) {
                list.set(1, "grape");
            }
        }

        // Print the list again
        System.out.println("List after adding grape while iterating: " + list);

	}
}
