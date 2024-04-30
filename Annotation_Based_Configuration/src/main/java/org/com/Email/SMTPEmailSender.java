package org.com.Email;

import org.springframework.stereotype.Component;

@Component("emailsender")
public class SMTPEmailSender implements EmailSender {

	public void sendEmail(String recipient, String message) {
		System.out.println("Sending email to " + recipient + ": " + message);
	}

}
