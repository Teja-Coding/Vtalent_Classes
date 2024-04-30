package MethodWithReturnType;

public class LengthArray {
	void length(int[]x) {
		int count=0;
		for(int i=0;i<=x.length-1;i++) {
			count++;
		}
		System.out.println("length is: "+count);
	}
	public static void main(String[] args) {
		LengthArray la=new LengthArray();
		int[] input= {10,50,60,10,70};
		la.length(input);
	}
}