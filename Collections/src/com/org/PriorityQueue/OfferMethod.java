package com.org.PriorityQueue;

import java.util.PriorityQueue;

/*---The offer() method in Java is used to add an element to a PriorityQueue. 
 * It inserts the specified element into the queue if it is possible to do so 
 * immediately without violating capacity restrictions, and returns true. 
 * If the queue is full, it returns false without adding the element.---*/
public class OfferMethod {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		PriorityQueue<Integer> queue1 = new PriorityQueue<>(2);
		
		queue.offer(5);
		queue.offer(2);
		queue.offer(7);
		queue.offer(1);
		System.out.println(queue); // Output: [1, 2, 7, 5]
		
		queue1.offer(20);
		queue1.offer(99);
		queue1.offer(66);
		
		boolean result=queue1.offer(1);
		System.out.println(result);
		
		

	}
}
