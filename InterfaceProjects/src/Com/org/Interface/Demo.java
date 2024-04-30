package Com.org.Interface;

public class Demo implements Son1{

	@Override
	public void building1() {
		// TODO Auto-generated method stub
		System.out.println("complate 1");
	}

	@Override
	public void building2() {
		// TODO Auto-generated method stub
		System.out.println("complate 2");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.building1();
		d.building1();
	}
	
}