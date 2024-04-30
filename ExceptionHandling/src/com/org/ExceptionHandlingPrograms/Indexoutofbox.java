package com.org.ExceptionHandlingPrograms;

public class Indexoutofbox {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        try {
	        System.out.println(arr[3]); // IndexOutOfBoundsException
	        }
	        catch (Throwable e) {
				// TODO: handle exception
	        	System.out.println(arr.length );
			}
	    }
}

