package com.org.LinkedList.methods;

import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		
		//adding some elements to the list
		list.add("manikanta");
		list.add("sri");
		list.add(22);
		list.add(999);
		list.add(55.6);
		
		//printing the linked list....
		System.out.println("List after adding elements: " + list);
		
		 // Add an element at a specific index
        list.add(1, "orange");
        System.out.println("List after adding orange at index 1: " + list);
        
        // Add an element to the beginning of the list
        list.addFirst("pear");
        System.out.println("List after adding pear at the beginning: " + list);
        
        // Add an element to the end of the list
        list.addLast("kiwi");
        System.out.println("List after adding kiwi at the end: " + list);
        
        // Get and remove an element at a specific index
        Object removed = list.remove(2);
        System.out.println("Removed element at index 2: " + removed);
        System.out.println("List after removing element at index 2: " + list);
        
        // Get and remove the first element of the list (equivalent to remove())
        Object first2 = list.removeFirst();
        System.out.println("Removed first element (equivalent to remove()): " + first2);
        System.out.println("List after removing first element: " + list);
        
        // Get and remove the last element of the list
        Object last = list.removeLast();
        System.out.println("Removed last element: " + last);
        System.out.println("List after removing last element: " + list);
        
        // Get an element at a specific index
        Object element = list.get(1);
        System.out.println("Element at index 1: " + element);
        
        // Replace an element at a specific index
        list.set(0, "grape");
        System.out.println("List after replacing element at index 0 with grape: " + list);
       

        // Get the number of elements in the list
        int size = list.size();
        System.out.println("Number of elements in the list: " + size);


        // Remove all elements from the list
        list.clear();
        System.out.println("List after clearing all elements: " + list);
        
        // Check if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty? " + isEmpty);
        
        // Check if the list contains an element
        boolean containsBanana = list.contains("banana");
        System.out.println("Does the list contain banana? " + containsBanana);
        
        
		
	}
}
