package StandardPrograms;

import java.util.Scanner;

/*153=1 5 3
 * 1*1*1=1
 * 5*5*5=125
 * 3*3*3=27
 * 1+125+27=153*/
public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		
		int temp=n;
		int r,sum=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
			
		}
		if(temp==sum) {
			System.out.println("it is an arm strong number");
		}
		else {
			{
				System.out.println("not an armstrong number");
			}
		}
	}
}
