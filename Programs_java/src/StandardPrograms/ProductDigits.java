package StandardPrograms;

public class ProductDigits {
	public static void main(String[] args) {
		int n=1234;
		int lastDigits=0;
		int product=1;
		while(n!=0) {
			lastDigits=n%10;
			product=product*lastDigits;
			n=n/10;
		}
		System.out.println(product);
	}
}
