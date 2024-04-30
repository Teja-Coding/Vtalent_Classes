package Com.org.Interface;

public class Demo2 implements Son2 {

	@Override
	public void building1() {
		// TODO Auto-generated method stub
		System.out.println("1 compteted");
	}

	@Override
	public void building3() {
		// TODO Auto-generated method stub
		System.out.println("3 complated");
	}
	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		d1.building1();
		d1.building3();
	}
	
}
