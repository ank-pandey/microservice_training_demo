package com.microservice.eurekaclient.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.eurekaclient.product.entity.Product;
import com.microservice.eurekaclient.product.ifaces.ProductRepository;

@RestController
public class ProductController {

	
	@Autowired
	private ProductRepository repo;


	
	@GetMapping(path = "/api/v1/products")
	public List<Product> getProduct(){
		
		
		return this.repo.findAll();
	}


}
