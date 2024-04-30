package StandardPrograms;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer");
	
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Given number is even "+n);
		}
		else {
			System.out.println("given number is odd");
		}
	}
}
