package com.org.arrays;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] arr = { 10, 50, 60, 90, 100 };

		for (int x : arr) {
			System.out.println(x);

		}
		arr[1]=101;
		System.out.println("element at first index: "+arr[1]);
		System.out.println("--------------------------------");
		for(int x:arr) {
			System.out.println(x);
		}
		System.out.println("length of array "+arr.length);
	}
}