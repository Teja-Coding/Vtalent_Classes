package org.com.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sevice1")
public class NotificationService {
	
	 private EmailSender emailSender;


	 	@Autowired
		public NotificationService(EmailSender emailSender) {
			// TODO Auto-generated constructor stub
			this.emailSender=emailSender;
		}


		public void sendNotification(String user) {
	        String message = "Hello, " + user + "! You have a new notification.";
	        emailSender.sendEmail(user, message);
	    }
}
