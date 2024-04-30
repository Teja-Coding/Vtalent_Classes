package org.com.HashMap;

import java.util.HashMap;

public class CountOfOccuranceOfCharacters {
	public static void main(String[] args) {
		String name="helloworld";
		
		int count;
		char ch;
		
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(hashMap.containsKey(ch)) {
				count=hashMap.get(ch);
				count++;
				hashMap.replace(ch,count);
			}else {
				hashMap.put(ch, 1);
			}
		}
		for(Character key:hashMap.keySet()) {
			System.out.println(key+" = "+hashMap.get(key));
		}
	}
}
