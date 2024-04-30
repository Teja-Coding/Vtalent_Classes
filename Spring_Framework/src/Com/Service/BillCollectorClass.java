package Com.Service;

import Com.payment.Payment;

public class BillCollectorClass {
	public Payment p;
	
	/*
	 * //Setter injection.... public void setP(Payment p) { this.p = p; }
	 */
	
	


	//Constructor injection..... 
	public BillCollectorClass(Payment p) {
		super();
		this.p = p;
	}





	public void payment(double amount) {
		String result=p.pay();
		System.out.println(result);
	}
}
