package com.org.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		
		System.out.println(pq);
		
		/*The peek() method in the PriorityQueue class returns 
		 * the highest-priority element in the queue without removing it. 
		 * This means that it only retrieves the element at the top of 
		 * the priority queue but does not remove it.*/
		
		System.out.println("PriorityQueue peek()method :"+pq.peek());
		
		/*The poll() method in Java is used to retrieve and 
		 * remove the head (first element) of a Queue*/
		
		System.out.println("poll() method in Java is used to retrieve and remove:"+pq.poll());
		
		System.out.println("after using the poll method :"+pq);
		
		/*The element() method in the PriorityQueue class in Java retrieves, but does not remove, 
		 * the highest-priority element from the queue.This method is similar to the peek() method, 
		 * but throws a NoSuchElementException if the queue is empty.*/
		System.out.println("elements method: "+pq.element());
		
		
		
	}
}
