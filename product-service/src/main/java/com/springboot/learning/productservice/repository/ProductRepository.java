package com.springboot.learning.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.learning.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
