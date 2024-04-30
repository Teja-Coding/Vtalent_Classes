package Com.org.Interface.Multiple;

public class Demo implements Child {

	@Override
	public void properties() {
		// TODO Auto-generated method stub
		System.out.println("hi all");
	}

	@Override
	public void properties2() {
		// TODO Auto-generated method stub
		System.out.println("hello all");
	}

	@Override
	public void properties3() {
		// TODO Auto-generated method stub
		System.out.println("hi every one");
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.properties();
		d1.properties2();
		d1.properties3();
	}
}
