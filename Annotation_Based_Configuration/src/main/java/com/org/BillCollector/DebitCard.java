package com.org.BillCollector;

import org.springframework.stereotype.Component;

@Component("DebitCard")
public class DebitCard implements Payment {

	public String pay() {
		
		return "Payemnt Done through Debit Card";
	}

}
