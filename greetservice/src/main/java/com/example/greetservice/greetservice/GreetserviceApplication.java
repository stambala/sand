package com.example.greetservice.greetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class GreetserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetserviceApplication.class, args);
	}

}
