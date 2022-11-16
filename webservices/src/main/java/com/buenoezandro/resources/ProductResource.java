package com.buenoezandro.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buenoezandro.entities.Product;
import com.buenoezandro.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	private final ProductService productService;

	public ProductResource(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = this.productService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product product = this.productService.findById(id);
		return ResponseEntity.ok().body(product);
	}
}
