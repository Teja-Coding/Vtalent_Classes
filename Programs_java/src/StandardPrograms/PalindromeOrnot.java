package StandardPrograms;

import java.util.Scanner;

public class PalindromeOrnot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		
		int temp=num;
		int lastDigit=0;
		int sum=0;
		while(num!=0) {
			lastDigit=num%10;
			sum=sum*10+lastDigit;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(sum +" is a palindrome number");
		}
		else {
			System.out.println(sum+" is not a palindrome number");
		}
	}
}
