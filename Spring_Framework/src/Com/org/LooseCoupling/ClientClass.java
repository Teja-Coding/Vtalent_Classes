package Com.org.LooseCoupling;

public class ClientClass {
	

	public static void main(String[] args) {
		CarClass c=new CarClass();
		BikeClass b=new BikeClass();
		TravelerClass tc=new TravelerClass(b);
		tc.startJourney();
	}
}
