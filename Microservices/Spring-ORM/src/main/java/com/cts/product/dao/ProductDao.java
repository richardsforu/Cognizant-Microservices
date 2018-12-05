package com.cts.product.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.product.entities.Product;

public interface ProductDao extends CrudRepository<Product,String> {
	

}
