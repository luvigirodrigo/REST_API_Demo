package com.myorg.RestDemo.service;

import java.util.List;

import com.myorg.RestDemo.model.Product;

public interface ProductService {
	public Product saveProduct(Product product);

	public Product updateProduct(Product product);

	public void deleteProduct(Integer productId);

	public Product searchProductByProductId(Integer productId);

	public List<Product> searchAllProducts();
}
