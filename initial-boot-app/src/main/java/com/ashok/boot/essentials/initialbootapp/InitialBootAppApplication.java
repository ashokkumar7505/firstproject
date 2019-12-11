package com.ashok.boot.essentials.initialbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InitialBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialBootAppApplication.class, args);
	}
		
		@RestController
		@RequestMapping("/api")
		public class ApiController{
			@GetMapping("/greeting")
			public String getGreeting() {
				return "Hello World greetings from ApiController";
			}
			
			@GetMapping("/")
			public String getBlank() {
				return "Hello World - /";
			}
			
			@GetMapping("")
			public String getBlank1() {
				return "Hello World - Blank";
			}
			
		}
		
		@RestController
		@RequestMapping("")
		public class ApiController1{
			@GetMapping("")
			public String getBlank1() {
				return "Hello World - localhost";
			}
			
		}
		
}

