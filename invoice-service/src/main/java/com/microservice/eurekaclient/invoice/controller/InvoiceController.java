package com.microservice.eurekaclient.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.eurekaclient.invoice.model.Invoice;

@RestController
@CrossOrigin(origins = "*")
public class InvoiceController {

	@Autowired
	private Invoice invoice;

	@Value("${server.port}")
	private String portNumber;

	@GetMapping(path = "/api/v1/invoices")
	public Invoice getInvoice() {
		int portNum = Integer.parseInt(portNumber);

		invoice.setId(portNum);
		invoice.setItemName("LED TV");
		invoice.setAmount(5000+portNum);

		return invoice;
	}

}
