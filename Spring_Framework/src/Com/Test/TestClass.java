package Com.Test;

import Com.Service.BillCollectorClass;
import Com.payment.CreditCard;
import Com.payment.DebitCard;
import Com.payment.Upi;

public class TestClass {
	public static void main(String[] args) {
		 BillCollectorClass b=new BillCollectorClass(new DebitCard());
			/* b.setP(new Upi()); */
		 
		 b.payment(155.55);
		 
		
	}
}
