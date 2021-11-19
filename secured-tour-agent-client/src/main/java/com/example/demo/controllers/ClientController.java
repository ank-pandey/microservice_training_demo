package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.TourAgentFeignClient;

@RestController
public class ClientController {

	
	@Autowired
	private TourAgentFeignClient client;
	
	
	@GetMapping("/feign/agents")
	public String findAll() {
		
		return this.client.getAll();
	}
}
