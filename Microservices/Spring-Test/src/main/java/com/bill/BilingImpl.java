package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.price.PriceMatrix;
import com.price.PriceMatrixImpl;

//Dependent
@Service
public class BilingImpl {
	
	/*
	 * Design Issues
	 * ---------------------
	 * 1. Too many Dependency class objects.
	 * 		-> Per of appl goes down, memory management issues
	 * 
	 * Why This issue happened?
	 *
	 * -> Dependent class creating dependent class object. 
	 * 
	 * What is the Solution?
	 * ------------------------
	 * 
	 * -> Do not create Dependency obj in the Dependent class.
	 * 		-> get this object by searching using JNDI
	 * 		-> JNDI location is tighly couple with dependent class.
	 * 
	 * What is the Best Solution?
	 * ---------------------------
	 * 
	 * -> Do not Crate, Do not find, insted ask some one (IOC)
	 * 
	 * -> Injecting Dependency to the Dependent class is called Dependency Injection (DI)
	 * 
	 * 
	 * It can be done with two ways
	 * --------------------------------
	 * 1. using setter injection.
	 * 2. using Constructor injection
	 * 
	 */
	
	
	@Autowired
	private PriceMatrix price;
	




	public double getCartTotal(String[] cart) {

		double total = 0.0;
		
		//PriceMatrix price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
