package com.org.String;

public class StringSplit {

	public static void main(String[] args) {
		String str1="thexyzwebsiteisxyzashokit";
		String[] split = str1.split("xyz");
		for(String str:split) {
			System.out.println(str);
		}
	}
}
