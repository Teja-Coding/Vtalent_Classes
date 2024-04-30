package org.com.EmailProject;

public class EmailSenderClass implements EmailSender {

	public void sendEmail(String recipient, String message) {
		// TODO Auto-generated method stub
		System.out.println("sending email to"+ recipient+": "+message);
	}

}
