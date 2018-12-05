package com.cts.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.beans.Product;

@RestController
public class ProductController {
	
	@GetMapping(value="/hello")
	public String f1() {
		System.out.println("--- f1 method of ProductController");
		return "Hello Meesaage from Spring rest service application as string";
	}
	
	
	@GetMapping("/h1")
	public Product f2() {
		Product prod=new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(125000);
		prod.setDescription("Dell laptop");
		return prod;
	}

}
