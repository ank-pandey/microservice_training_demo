package com.microservice.eurekaclient.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "syneproduct")
public class Product {

	@Id
	private int id;

	private String productName;
	private double ratePerUnit;

}
