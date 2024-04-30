package com.org.BillCollector;

import org.springframework.stereotype.Component;

@Component("creditCard")
public class CreditCard implements Payment{

	public String pay() {
		
		return "Payment done through CreditCard";
		
		
	}

}
