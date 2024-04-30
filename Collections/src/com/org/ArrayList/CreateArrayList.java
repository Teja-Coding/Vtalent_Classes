package com.org.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CreateArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(90);
		al.add(100);

		System.out.println("=====for loop approch======");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("==== for each loop=====");
		for (Object obj : al) {
			System.out.println(obj);
		}

		System.out.println("====Iterator Approach====");
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("===ListIterator Approach===");
		ListIterator listIterator = al.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("===java 8 futures===");
		al.forEach(System.out::println);

	}
}