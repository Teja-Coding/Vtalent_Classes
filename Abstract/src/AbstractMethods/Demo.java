package AbstractMethods;

public abstract class Demo {
	public static void main(String[] args) {
		child c1= new child();
		c1.hello();
		c1.test();
	}
	
	void hello() {
		System.out.println("hi all how are you");
	}
	abstract void test();
	
}
class child extends Demo{

	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println(" hi my name yuva");
	}
	
}
