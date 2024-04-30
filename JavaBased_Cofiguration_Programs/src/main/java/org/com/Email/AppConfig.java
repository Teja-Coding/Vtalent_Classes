package org.com.Email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public EmailSender smtpEmailSender() {
		return new SMTPEmailSender();
	}
	@Bean
	public NotificationService notificationService() {
		return new NotificationService(smtpEmailSender());
		
	}
}