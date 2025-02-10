package com.kushalobroy.apivault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class ApivaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApivaultApplication.class, args);
	}

}
