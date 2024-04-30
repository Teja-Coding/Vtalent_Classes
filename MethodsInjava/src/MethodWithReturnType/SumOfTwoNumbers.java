package MethodWithReturnType;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		sumOfTwoNumbers();
	}
     static void sumOfTwoNumbers() {
		int[]arr= {1,2,3,4,5,6,7};
		int sum=8;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
				}
			}
		}
     }
}
