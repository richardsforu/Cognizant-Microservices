package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BilingImpl;


public class Test {

	public static void main(String[] args) {

		String cart1[] = { "P001", "P002", "P003" };
		String cart2[] = { "P004", "P005" };
		
	
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		BilingImpl bill= ac.getBean(BilingImpl.class);
		
		
		double total = bill.getCartTotal(cart1);
		System.out.println("--- Total of Cart1: " + total);

		
		
		 total = bill.getCartTotal(cart2);
		System.out.println("--- Total of Cart2: " + total);
	}

}
