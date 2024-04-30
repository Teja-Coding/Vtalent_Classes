package org.com.Email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmailSender {
	 public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 NotificationService bean = context.getBean(NotificationService.class);
		 bean.sendNotification("manikanta");
	 }
}