package com.org.BillCollector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Payment creditPayment() {
		return new CreditCard();		
	}
	@Bean
	public Payment debitPayment() {
		return new DebitCard();
	}
	@Bean
	public Payment upiPayment() {
		return new UPI();
	}
	@Bean
	public BillCollector billCollector() {
		return new BillCollector(creditPayment());
		
	}
}
