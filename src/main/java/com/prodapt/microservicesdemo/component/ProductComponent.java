package com.prodapt.microservicesdemo.component;

import java.util.List;

import org.springframework.stereotype.Component;

import com.prodapt.microservicesdemo.model.Product;
import com.prodapt.microservicesdemo.service.ProductService;

@Component
public class ProductComponent {
	
	private ProductService productService;
	
	public ProductComponent(ProductService productService) {
		this.productService = productService;
	}
	
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}

}
