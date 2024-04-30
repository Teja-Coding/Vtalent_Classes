package com.org.LinkedList.methods;

import java.util.LinkedList;

public class LinkedListExample2 {
	public static void main(String[] args) {
		// Create a new LinkedList object
        LinkedList<String> list = new LinkedList<String>();

        // Add some elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Print the list
        System.out.println("List after adding elements: " + list);

        // Check if the list contains an element
        boolean containsBanana = list.contains("banana");
        System.out.println("Does the list contain banana? " + containsBanana);

        // Get the index of the first occurrence of an element
        int index = list.indexOf("banana");
        System.out.println("Index of banana: " + index);

        // Get the index of the last occurrence of an element
        int lastIndex = list.lastIndexOf("banana");
        System.out.println("Last index of banana: " + lastIndex);

        // Get a sublist of the list
        LinkedList<String> sublist = new LinkedList<String>(list.subList(1, 3));
        System.out.println("Sublist: " + sublist);

        // Add all elements from another collection to the list
        LinkedList<String> otherList = new LinkedList<String>();
        otherList.add("grape");
        otherList.add("kiwi");
        list.addAll(otherList);
        System.out.println("List after adding elements from another list: " + list);

        // Remove all elements in the list that are also in another collection
        list.removeAll(otherList);
        System.out.println("List after removing elements in another list: " + list);

        // Retain only the elements in the list that are also in another collection
        list.retainAll(sublist);
        System.out.println("List after retaining only elements in the sublist: " + list);

        // Convert the list to an array
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("Array: ");
        for (String element : array) {
            System.out.println(element);
        }
    }
}

