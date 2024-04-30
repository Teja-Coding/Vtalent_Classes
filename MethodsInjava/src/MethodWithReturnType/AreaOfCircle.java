package MethodWithReturnType;

public class AreaOfCircle {
	
		static int AreaOfCircle() {
		int radius=20;
		double pi=3.14;
		return (int) (pi*radius*radius);
		
	}
	public static void main(String[] args) {
		int res=AreaOfCircle();
		System.out.println("area of the circle is "+res);
	}
}
