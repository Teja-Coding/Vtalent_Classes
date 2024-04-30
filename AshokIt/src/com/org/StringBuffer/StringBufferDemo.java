package com.org.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("manikanta");
		
		System.out.println(stringBuffer);
		System.out.println("after modifying string");
		//modifying object
		stringBuffer.append("yuva");
		System.out.println(stringBuffer);
		System.out.println("insert method using...");
		stringBuffer.insert(2, 123);
		System.out.println(stringBuffer);
	}
}
