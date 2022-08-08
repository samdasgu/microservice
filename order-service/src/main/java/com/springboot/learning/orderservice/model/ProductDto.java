package com.springboot.learning.orderservice.model;

import java.math.BigDecimal;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductDto {
	
	private String id;
	private String name;
	private String description;
	private BigDecimal price;

}
