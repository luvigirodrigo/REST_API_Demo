package com.myorg.RestDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.myorg.RestDemo.model.Product;
import com.myorg.RestDemo.repository.ProductRepository;
import com.myorg.RestDemo.service.ProductService;

@Service("productServiceImplementor")
public class ProductServiceImplementor implements ProductService {

	@Autowired
	@Qualifier("productRepository")
	public ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer productId) {
		productRepository.deleteByProductId(productId);
	}

	@Override
	public Product searchProductByProductId(Integer productId) {
		return productRepository.findByProductId(productId);
	}

	@Override
	public List<Product> searchAllProducts() {
		return productRepository.findAll();
	}

}
