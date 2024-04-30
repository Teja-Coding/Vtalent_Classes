package org.com.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//entryset ( ) --> to get all entries of map

public class EntrysetMethod {
	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "mani");
		hm.put(2, "yuva");
		hm.put(3, "sri");
		hm.put(4, "teja");
		
		System.out.println(hm);
		
		Set<Entry<Integer, String>> iter=hm.entrySet();
		for(Entry<Integer, String> entry:iter) {
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
	}
}
