package StandardPrograms;

import java.util.Scanner;
/*wap find exponetial value for the given base and power value+ */
public class Exponentialvalue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base of a number");
		int base=sc.nextInt();
		System.out.println("enter the power of a number");
		int power=sc.nextInt();
		
		int exp=1;
		for(int i=1;i<=power;i++) {
			exp=exp*base;
		}
		System.out.println(exp);
	}
}
