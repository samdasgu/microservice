package com.springboot.learning.orderservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.learning.orderservice.model.ProductDto;

@FeignClient("product-service")
//@FeignClient(value="product-service", url = "http://localhost:8080/")
public interface ProductClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/product", produces = "application/json")
	List<ProductDto> getAllProducts();

}
