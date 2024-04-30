package Com.payment;

public class BillCollector {
	public static void main(String[] args) {
		BillCollector bc= new BillCollector();
		bc.payment();
	}
	public void payment() {
		CreditCard c=new CreditCard();
		c.pay();
	}
}
