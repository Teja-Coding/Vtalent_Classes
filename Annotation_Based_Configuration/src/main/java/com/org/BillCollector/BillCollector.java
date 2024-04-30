package com.org.BillCollector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("billCollector")
public class BillCollector {

	private Payment p;

	
	  @Autowired
	 
	  public BillCollector( @Qualifier("creditCard") Payment p) {
		  this.p=p; 
		  }
	 

	/* public void setPayment(Payment p ) { this.p=p; } */



	public void Payment(double amount) {
		String result = p.pay();
		System.out.println(result);
	}
}
