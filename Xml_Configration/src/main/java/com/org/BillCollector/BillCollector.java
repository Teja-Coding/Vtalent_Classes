package com.org.BillCollector;

public class BillCollector {

	private Payment p;

	/*
	 * public BillCollector(Payment p) { this.p=p; }
	 */

	public void setPayment(Payment p) {
		this.p = p;
	}

	public void Payment(double amount) {
		String result = p.pay();
		System.out.println(result);
	}
}