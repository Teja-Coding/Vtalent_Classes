package Com.org.TightCoupling_Example;

public class CarClass extends EngineClass {
	
	public void drive() {
		EngineClass e= new EngineClass();
		int start = e.start();
		
		if(start>=1) {
			System.out.println("car started and moving");
		}
		else {
			System.out.println("engine has some issues");
		}
	}
}
