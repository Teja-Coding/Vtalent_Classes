package org.com.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMapExample {
	public static void main(String[] args) {
		  // create a HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        
        // create a synchronized HashMap
        Map<String, String> synchronizedHashMap = Collections.synchronizedMap(hashMap);
        
        // access the synchronized HashMap
        synchronized (synchronizedHashMap) {
            for (Map.Entry<String, String> entry : synchronizedHashMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
	