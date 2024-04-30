package org.com.Email;



public class SMTPEmailSender implements EmailSender {

	public void sendEmail(String recipient, String message) {
		System.out.println("Sending email to " + recipient + ": " + message);
	}

}
