package StandardPrograms;

import java.util.Scanner;
/*write a program whether a given number is prime number
 * or not*/
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		int count=0;
		
		for(int a=1;a<=num;a++) {
			if(num%a==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number  ");
		}
		}
}
