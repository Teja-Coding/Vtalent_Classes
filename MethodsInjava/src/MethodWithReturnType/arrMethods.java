package MethodWithReturnType;

import java.util.Arrays;

public class arrMethods {

	public static void main(String[] args) {
		
		//object creation
		arrMethods m = new arrMethods();

		int[] ar = { 1, 2, 3 };
		m.print(ar);
		
		m.fullname("ashok", "it");
	}

	void fullname(String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}

	void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}