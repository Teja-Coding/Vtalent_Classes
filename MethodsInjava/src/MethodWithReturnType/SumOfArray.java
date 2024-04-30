package MethodWithReturnType;

public class SumOfArray {
	int missing(int[] x) {
		int sum=0;
		for(int i=0;i<=x.length-1;i++) {
		sum=sum+x[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] input= {10,50,60,70,100};
		SumOfArray soa=new SumOfArray();
		System.out.println(soa.missing(input));
	}
	
}
