package StandardPrograms;

import java.util.Scanner;

/*0 1 1 2 3 5 8
 **/
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the range" );
		int n=sc.nextInt();
		
		int firstTerm=0,secondTerm=1;
		
		for (int i=1;i<n;++i) {
			int nextTerm=firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm=nextTerm;
			System.out.print(nextTerm+" ");
			
			
		}
		
	}
}
