package com.org.Stack;

import java.util.Stack;

public class DemoStack {
	public static void main(String[] args) {

		    Stack<Integer> stack = new Stack<>(); // create a new stack object

		    // push elements onto the stack
		    stack.push(1);
		    stack.push(2);
		    stack.push(3);
		    stack.push(4);
		    stack.push(5);

		    // pop elements off the stack
		    while (!stack.isEmpty()) {
		      int element = stack.pop();
		      System.out.println(element);
		    }
		    System.out.println("stack is clear after using pop method....");
		    System.out.println(stack);
	}

}