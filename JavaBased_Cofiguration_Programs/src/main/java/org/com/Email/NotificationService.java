package org.com.Email;

public class NotificationService {
	
	 private EmailSender emailSender;



		public NotificationService(EmailSender emailSender) {
			// TODO Auto-generated constructor stub
			this.emailSender=emailSender;
		}


		public void sendNotification(String user) {
	        String message = "Hello, " + user + "! You have a new notification.";
	        emailSender.sendEmail(user, message);
	    }
}
