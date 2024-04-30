package StandardPrograms;

public class Print1To100Pal {
	public static void main(String[] args) {
		for(int num=1;num<=1000;num++) {
			int lastDigit=0;
			int rev=0;
			int temp=num;
			
			while(num!=0) {
				lastDigit=num%10;
				rev=rev*10+lastDigit;
				num=num/10;
			}
			num=temp;
			if(rev==num) {
				System.out.println(rev+" is a pal numbers...");
			}
		}
	}
}
