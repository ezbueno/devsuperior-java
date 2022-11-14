package com.buenoezandro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buenoezandro.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
