package Com.Service;

import Com.EmailSender.EmailSender;

public class NotificationService {
	 public EmailSender sender;

		
	 

		public NotificationService(EmailSender sender) {
		super();
		this.sender = sender;
	}
		  public void sendNotification(String user) {
		        String message = "Hello, " + user + "! You have a new notification.";
		        sender.sendEmail(user, message);
		    }
}
