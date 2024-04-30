package org.com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleProgram {
	public static void main(String[] args) {
		 Map<String, String> map = new LinkedHashMap<>();
	        map.put("one", "1");
	        map.put("two", "2");
	        map.put("three", "3");

	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }
	}
}