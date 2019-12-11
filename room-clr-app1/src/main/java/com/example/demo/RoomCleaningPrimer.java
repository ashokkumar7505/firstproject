package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RoomCleaningPrimer implements CommandLineRunner {
	
	private RestTemplate restTemplate;
	
	@Value("${spring.ldap.username}")
	public String username; 
	
	@Value("${spring.ldap.password}")
	public String password;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RoomClrApp1Application.class);
	

	public RoomCleaningPrimer() {
		super();
		this.restTemplate = new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		LOGGER.info("Before calling "+username+password);
		
		String url="http://localhost:8080/api/rooms";
		Room[] roomArray = this.restTemplate.getForObject(url,Room[].class);
		List<Room> rooms = Arrays.asList(roomArray);
		rooms.forEach(System.out::println);
	}

}
