package org.com.Email;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmailSender {
	 public static void main(String[] args) {

		 ApplicationContext context=new ClassPathXmlApplicationContext("Email.xml");
		 NotificationService bean = context.getBean("n",NotificationService.class);
		 String user = "manikanta";
		 bean.sendNotification(user);
		 
	    }
}