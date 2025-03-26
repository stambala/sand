package com.test1.demotest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Demotest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demotest1Application.class, args);
	}

}
