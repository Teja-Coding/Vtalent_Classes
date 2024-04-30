package StandardPrograms;

public class PrimeOrComposite {
	public static void main(String[] args) {
		for(int a=1;a<=100;a++) {
			int count=0;
			for(int i=1;i<a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count<=1) {
				System.out.println(a +" neighter prime nor composite number");
			}
			else if(count==2) {
				System.out.println(a+ " is prime number");
			}
			else {
				System.out.println(a+ " composite number");
			}
		}
	}
}
