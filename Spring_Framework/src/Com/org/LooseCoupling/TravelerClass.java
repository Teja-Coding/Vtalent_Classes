package Com.org.LooseCoupling;

public class TravelerClass {
	private Vechicle vechicle;

	public TravelerClass(Vechicle vechicle) {
		super();
		this.vechicle = vechicle;
	}
	
	public void startJourney() {
		this.vechicle.moving(); 
	}
}
