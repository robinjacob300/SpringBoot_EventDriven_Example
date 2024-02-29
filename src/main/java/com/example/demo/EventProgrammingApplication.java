package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventProgrammingApplication.class, args);
		System.out.println("Starting application");
	}

}
