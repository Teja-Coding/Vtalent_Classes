package StandardPrograms;

import java.util.Scanner;

public class NprimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		int x=0;
		int prime_count=1;
		
		while(prime_count<=num) {
			int count=0;
			for(int a=1;a<=x;a++) {
				if(x%a==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(x+" ");
				prime_count++;
			}
			x++;
		}
		System.out.println(prime_count);
	}
}
