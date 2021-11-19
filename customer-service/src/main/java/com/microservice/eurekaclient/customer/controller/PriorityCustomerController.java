package com.microservice.eurekaclient.customer.controller;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.eurekaclient.customer.model.Customer;

@RestController
public class PriorityCustomerController {

	@Autowired
	private Customer customer;
	
	
	
	
	@GetMapping(path = "/api/v2/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) throws InterruptedException {
		
		if(id < 7) {
		   return this.customer;
		   
		} else {
			
			throw new NoSuchElementException("Element Not Found");
		}
	}

}