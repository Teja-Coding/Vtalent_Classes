package Com.EmailSender;



public class SMTPEmailSender implements EmailSender {

	@Override
	public void sendEmail(String recipient, String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending email to " + recipient + ": " + message);
	}

}
