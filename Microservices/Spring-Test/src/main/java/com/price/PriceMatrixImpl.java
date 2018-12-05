package com.price;

import org.springframework.stereotype.Repository;

// Dependency
@Repository
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrix Object is Created...");
	}
	
	
	
	public double getItemPrice(String itemCode) {
		
		// code to connect to DB and fecth Price for a given itemCode
		
		return 100.00;
		
	}
	
	

}
