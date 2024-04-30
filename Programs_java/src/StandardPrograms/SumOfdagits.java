package StandardPrograms;

import java.util.Scanner;

public class SumOfdagits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		
		
		int lastDigit=0;
		int sum=0;
		
		while(num!=0) {
			lastDigit=num%10;
			sum=sum+lastDigit;
			num=num/10;
		}
		System.out.println("sum of digit "+ sum);
	}
}
