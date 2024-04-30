package com.org.PrimitiveArrays;

public class PrimitiveWithNewkey {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=60;
		
		System.out.println("my elements in array are: ");
		
		for(int x:array) {
			System.out.println(x);
		}
		
	}

}
