package Com.payment;

public class DebitCard implements Payment {

	@Override
	public String pay() {
		return "payment done by DebitCard...";
	}

}
