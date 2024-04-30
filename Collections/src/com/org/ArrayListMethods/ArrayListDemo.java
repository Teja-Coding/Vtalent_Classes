package com.org.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// adding or inserting objects elements
		ArrayList al = new ArrayList<>();

		al.add("manikanta");// 0
		al.add(20);// 1
		al.add(25.55);// 2
		al.add(30);// 3
		al.add(null);// 4
		System.out.println(al);

		// searching that elements is present or not
		System.out.println(al.contains("uma"));

		// fetching a particular data..........
		System.out.println(al.get(4));

		// delete of a particular data/object.......
		al.remove(0);
		System.out.println(al);

		// modification of my list.......
		al.add(0, "uma");
		System.out.println(al);

		// modification of a particular object...
		al.set(4, 6666);
		System.out.println(al);

		// to get the length of arraylist
		System.out.println(al.size());

		// to romove all the objects form collection
		al.clear();
		System.out.println(al);

		// to check collection is emity or not
		System.out.println(al.isEmpty());

		// to get first occurence of given obj
		int index = al.indexOf("manianta");
		System.out.println(index);

	}
}