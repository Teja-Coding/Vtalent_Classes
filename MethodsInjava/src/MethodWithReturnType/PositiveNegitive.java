package MethodWithReturnType;

public class PositiveNegitive {
	static String postiveNegitive(int num) {
		if(num>0) {
			return "given number is positive"; 
		}
		else {
			return "given number is negitive";
		}
	}
	public static void main(String[] args) {
		String result=postiveNegitive(5);
		System.out.println(result);
	}
}
