package com.example.secdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SecdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecdemoApplication.class, args);
	}

}

