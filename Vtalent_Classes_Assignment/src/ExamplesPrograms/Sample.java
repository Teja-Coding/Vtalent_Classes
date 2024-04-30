package ExamplesPrograms;

public class Sample {
	public static int a=10;
	public  int b=20;
	public static void main(String[ ] args){
		System.out.println("main starts");
		System.out.println(Sample.a);
		
		Sample s1=new Sample();
		System.out.println(s1.b);
		
		System.out.println("main ends");
	}
}