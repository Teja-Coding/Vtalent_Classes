package org.com.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ContainsKeyMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key value to check present or not: ");
		String key=sc.next();
		 // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("apple", 1);
        map.put("baneana", 2);
        map.put("orange", 3);

        // Check if a key exists in the map
        if (map.containsKey(key)) {
            System.out.println("The key "+key+" is present in the map.");
        } else {
            System.out.println("The key "+key+" is not present in the map.");
        }
	}
}