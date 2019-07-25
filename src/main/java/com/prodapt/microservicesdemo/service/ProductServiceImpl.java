package com.prodapt.microservicesdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prodapt.microservicesdemo.model.Product;
import com.prodapt.microservicesdemo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

}
