package StandardPrograms;

import java.util.Scanner;

/*wap whether the given number is perfect or not*/
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		
		int sum=0;
		for(int a=1;a<n;a++) {
			if(n%a==0) {
				sum=sum+a;
			}
		}
		if(sum==n) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
	}
}
