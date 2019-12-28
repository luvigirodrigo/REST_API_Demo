package com.myorg.RestDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.RestDemo.model.Product;
import com.myorg.RestDemo.service.ProductService;

@RestController("productController")
@RequestMapping("/api")
public class ProductController {
	@Autowired
	@Qualifier("productServiceImplementor")
	public ProductService productService;

	@PostMapping(value = "/products")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
}
