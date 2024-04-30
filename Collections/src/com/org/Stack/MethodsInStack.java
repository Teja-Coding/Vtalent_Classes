package com.org.Stack;

import java.util.Stack;

public class MethodsInStack {
	public static void main(String[] args) {
	    Stack<String> stack = new Stack<>();

	    // push items onto the stack
	    stack.push("apple");
	    stack.push("banana");
	    stack.push("cherry");

	    // print the top item without removing it
	    System.out.println(stack.peek()); // prints "cherry"
	    
	    System.out.println("--------------------------------------");

	    // remove and print each item from the stack
	    while (!stack.empty()) {
	      System.out.println(stack.pop());
	    }
	    
	    System.out.println("---------------------------------------");

	    // push some more items onto the stack
	    stack.push("date");
	    stack.push("elderberry");
	    System.out.println(stack);
	    
	    System.out.println("---------------------------------------");

	    // search for an item in the stack
	    int position = stack.search("date");
	    System.out.println("Position of 'date' in stack: " + position); // prints "Position of 'date' in stack: 2"
	    
	    System.out.println(stack.peek());
	  }
}
