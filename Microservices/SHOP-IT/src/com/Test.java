package com;

import com.bill.BilingImpl;
import com.price.PriceMatrix;
import com.price.PriceMatrixImpl;

public class Test {


	public static void main(String[] args) {

		String cart1[] = { "P001", "P002", "P003" };
		String cart2[] = { "P004", "P005" };
		
	
		
		
		
		
		//-----------------------------------------
		PriceMatrix price=new PriceMatrixImpl(); // Dependency obj
		//-----------------------------------------

		BilingImpl bill = new BilingImpl();
		bill.setPrice(price); // DI
		
		double total = bill.getCartTotal(cart1);
		System.out.println("--- Total of Cart1: " + total);

		
		
		 total = bill.getCartTotal(cart2);
		System.out.println("--- Total of Cart2: " + total);
	}

}
