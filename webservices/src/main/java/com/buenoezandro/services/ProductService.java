package com.buenoezandro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buenoezandro.entities.Product;
import com.buenoezandro.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> findAll() {
		return this.productRepository.findAll();
	}

	public Product findById(Long id) {
		return this.productRepository.findById(id).orElse(null);
	}
}
