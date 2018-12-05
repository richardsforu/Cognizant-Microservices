package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class SpringOrmApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac=SpringApplication.run(SpringOrmApplication.class, args);
		
	ProductService ps=	ac.getBean(ProductService.class);
		
		Product prod=new Product();
		prod.setPrice(45000);
		prod.setProdId("P002");
		prod.setProdName("Laptop");
		
		ps.saveProduct(prod);
		
		System.out.println("--- Done ---");
		
		
	}
}
