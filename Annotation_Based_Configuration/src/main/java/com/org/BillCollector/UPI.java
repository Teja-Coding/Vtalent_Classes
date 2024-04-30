package com.org.BillCollector;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPI implements Payment{

	public String pay() {
		
		return "Payment done through UPI";
	}

}
