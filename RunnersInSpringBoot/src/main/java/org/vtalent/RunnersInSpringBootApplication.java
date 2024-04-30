package org.vtalent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import org.vtalent.security.ApplicationSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"org.service","org.vtalent"})
public class RunnersInSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(RunnersInSpringBootApplication.class, args);
		System.out.println(run.getClass().getName());
		System.out.println(run.getBeanDefinitionCount());
	}
	
	@Bean
	public ApplicationSecurity createInstance() {
		ApplicationSecurity as=new ApplicationSecurity();
		//logic
		return as;
		
	}
}
