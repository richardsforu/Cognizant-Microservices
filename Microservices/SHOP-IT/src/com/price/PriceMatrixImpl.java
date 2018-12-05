package com.price;

// Dependency

public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrix Object is Created...");
	}
	
	
	@Override
	public double getItemPrice(String itemCode) {
		
		// code to connect to DB and fecth Price for a given itemCode
		
		return 100.00;
		
	}
	
	

}
