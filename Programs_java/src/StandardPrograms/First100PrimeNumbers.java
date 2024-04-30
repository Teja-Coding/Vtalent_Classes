package StandardPrograms;
/*write to first 100 prime numbers*/
public class First100PrimeNumbers {
	public static void main(String[] args) {
		int x=0;
		int prime_count=1;
		while(prime_count<=100) {
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
	}
}
