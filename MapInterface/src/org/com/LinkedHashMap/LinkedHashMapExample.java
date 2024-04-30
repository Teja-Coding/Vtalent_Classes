package org.com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        
        // create a new LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // add some key-value pairs
        linkedHashMap.put("apple", 5);
        linkedHashMap.put("banana", 3);
        linkedHashMap.put("cherry", 2);
        linkedHashMap.put("date", 7);
        
        // print the contents of the LinkedHashMap
        System.out.println("LinkedHashMap before modification: " + linkedHashMap);
        
        // get the value associated with a key
        int value = linkedHashMap.get("banana");
        System.out.println("Value of 'banana': " + value);
        
        // remove a key-value pair
        linkedHashMap.remove("cherry");
        System.out.println("LinkedHashMap after removal of 'cherry': " + linkedHashMap);
        
        // check if a key is present in the LinkedHashMap
        boolean containsKey = linkedHashMap.containsKey("date");
        System.out.println("LinkedHashMap contains 'date': " + containsKey);
        
        // check if a value is present in the LinkedHashMap
        boolean containsValue = linkedHashMap.containsValue(2);
        System.out.println("LinkedHashMap contains value 2: " + containsValue);
        
        // get the number of key-value pairs in the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of LinkedHashMap: " + size);
        
        // clear the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clear: " + linkedHashMap);
    }

}

