package org.com.EmailProject;

public class NotificationServiceClass {
	private EmailSender emailSender;

	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}
	public void sendNotification(String user) {
		String messeage="hello, "+user+" ! you have a new notification.";
		emailSender.sendEmail(user, messeage);
		
	}
	
}
