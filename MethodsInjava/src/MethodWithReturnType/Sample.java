package MethodWithReturnType;

public class Sample {
	public static void main(String[] args) {
		adding();
		Sample s1=new Sample();
		s1.add();
		sum(100, 2);
		s1.test(500, 500);
	
		
		
	
	}
	//method without return type, without parameters
	static void adding() {
		int a=100;
		int b=200;
		System.out.println(a+b);
		
		
	}
	void add() {
		int a=100;
		int b=1000;
		System.out.println(a-b);
	}
	//method without return type, with parameters
	static void sum(int a,int b) {
		System.out.println(a*b);
	}
	void test(int a, int b) {
		
		System.out.println(a+b);
	}
}

