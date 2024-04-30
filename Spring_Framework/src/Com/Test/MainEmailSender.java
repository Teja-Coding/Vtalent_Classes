package Com.Test;



import Com.EmailSender.EmailSender;
import Com.EmailSender.SMTPEmailSender;
import Com.Service.NotificationService;

public class MainEmailSender {
	 public static void main(String[] args) {
	        EmailSender emailSender = new SMTPEmailSender();

	        // Create an instance of NotificationService and pass the EmailSender instance
	        NotificationService notificationService = new NotificationService(emailSender);

	        // Send a notification
	        String user = "mainkanta";
	        notificationService.sendNotification(user);
	    }
}