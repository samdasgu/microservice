package com.springboot.learning.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product/test")
@RefreshScope
public class TestController {
	
	@Value("${product.test.name}")
	private String name;
	
	@GetMapping
	public String test() {
		return this.name;
	}

}
