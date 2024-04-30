package MethodWithReturnType;

public class EvenOdd {
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		boolean result=eo.evenOdd(5);
		if(result) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}
	boolean evenOdd(int a) {
		if(a % 2 ==0) {
			return true;
		}else {
			return false;
		}
		
	}
}
