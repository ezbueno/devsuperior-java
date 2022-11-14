package com.buenoezandro.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buenoezandro.entities.Category;
import com.buenoezandro.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	private final CategoryService categoryService;

	public CategoryResource(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = this.categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = this.categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}
}
