package com.springboot.learning.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.orderservice.client.ProductClient;
import com.springboot.learning.orderservice.model.ProductDto;

@RestController
@RequestMapping("/api/order")
@RefreshScope
public class OrderController {
	
	@Autowired
	private ProductClient productClient;
	
	@Value("${order.test.name}")
	private String name;
	
	@GetMapping("/fetchProducts")
	public List<ProductDto> getAllProducts() {
	    return productClient.getAllProducts();
	}
	
	@GetMapping
	public String test() {
		return this.name;
	}

}
