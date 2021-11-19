package com.microservice.eurekaclient.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.microservice.eurekaclient.customer.model.Customer;

@SpringBootApplication
@EnableDiscoveryClient

//@EnableEurekaClient - this can be used but it will be dedicately for Eureka Discovery.
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	public Customer ramesh() {
		return new Customer(1, "Ankit", 880880880L);
	}

}
