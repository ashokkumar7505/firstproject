package com.example.demo;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class RoomCleanerProcessor {
	private final ObjectMapper objectMapper;

	public RoomCleanerProcessor(ObjectMapper objectMapper) {
		super();
		this.objectMapper = objectMapper;
	}
	
	

}
