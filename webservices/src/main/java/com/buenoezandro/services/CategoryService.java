package com.buenoezandro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buenoezandro.entities.Category;
import com.buenoezandro.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public List<Category> findAll() {
		return this.categoryRepository.findAll();
	}

	public Category findById(Long id) {
		return this.categoryRepository.findById(id).orElse(null);
	}
}
