package com.prodapt.microservicesdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.microservicesdemo.component.ProductComponent;
import com.prodapt.microservicesdemo.constant.AppConstants;
import com.prodapt.microservicesdemo.constant.URLConstants;
import com.prodapt.microservicesdemo.model.Product; 

@RestController
@RequestMapping(path = "/api")
public class DashboardController {
	
	private ProductComponent productComponent;
	
	public DashboardController(ProductComponent productComponent) {
		this.productComponent = productComponent;
	}
	
	@RequestMapping(path = URLConstants.GET_ALL_PRODUCTS)
	public List<Product> getProducts() {
		return this.productComponent.getAllProducts();
	}

}
