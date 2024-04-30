package com.org.BillCollector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	BillCollector bean = context.getBean(BillCollector.class);
	bean.Payment(5000);
	}
}