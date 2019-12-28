package com.myorg.RestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myorg.RestDemo.model.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	public void deleteByProductId(Integer productId);

	public Product findByProductId(Integer productId);
}
