package com.microservice.eurekaclient.invoice.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Invoice {

	int id;
	String itemName;
	double amount;

}
