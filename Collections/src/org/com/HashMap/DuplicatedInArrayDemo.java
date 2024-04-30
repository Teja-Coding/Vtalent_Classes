package org.com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedInArrayDemo {
	public static void main(String[] args) {
		int[] inputArr= {2,6,6,2,9,4,5,8,6};
		
		DuplicatedInArrayDemo.Duplicate(inputArr);
	}
	private static void Duplicate(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		for(int value:arr) {
			if(!hashMap.containsKey(value)) {
				hashMap.put(value, 1);
			}
			else {
				hashMap.put(value, hashMap.get(hashMap)+1);
			}
		}
		for(Integer value:hashMap.keySet()) {
			if(hashMap.get(value)>1) {
				System.out.println("Duplicate elements is: "+value);
			}
		}
	}
	
}
