package com.org.BillCollector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bill.xml");
		BillCollector bean = context.getBean("bill",BillCollector.class);
		bean.Payment(5000);
		System.out.println(bean.hashCode());
		
		BillCollector bean2 = context.getBean("bill",BillCollector.class);
		bean2.Payment(5000);
		System.out.println(bean2.hashCode());
	}
}