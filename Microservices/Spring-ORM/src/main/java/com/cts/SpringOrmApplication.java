package com.cts;

import java.util.Scanner;

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
	Scanner sc=new Scanner(System.in);
	System.out.println("Product Id");
	prod.setProdId(sc.nextLine());
	System.out.println("Product Name");
	prod.setProdName(sc.nextLine());
	System.out.println("Product price");
	prod.setPrice(sc.nextDouble());
	
		

  ps.saveProduct(prod);
		
		System.out.println("--- Done ---");
		
		
	}
}
