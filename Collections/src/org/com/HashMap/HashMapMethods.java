package org.com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapMethods {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "manikanta");
		hm.put(2, "sri");
		hm.put(3, "yuva");
		hm.put(4, "teja");
		
		System.out.println(hm);
		
		//to find the size of hashmap
		System.out.println("size of the hashmap: "+hm.size());
		
		// to get the value of the key 
		
		System.out.println("the value of the key: "+hm.get(1));
		
		//remove(k) ---> to remove one entry based on given key
		hm.remove(1);
		System.out.println(hm);
		
		//containsKey(k) ---> to check presense of given key
		System.out.println("key is presented or not: "+hm.containsKey(1));
		
		//values ( ) ----> To get all values of the map
		
		Collection<String> value=hm.values();
		System.out.println("---the values are presented in hashmap---");
		for(String v:value) {
			
			System.out.println(v);
		}
		
		//keySet ( ) ---> To get all keys of map
		System.out.println("to get the key of hash map");
		Set<Integer> key=hm.keySet();
		for(Integer k:key) {
			System.out.println(k);
		}
		
	}
	
}
