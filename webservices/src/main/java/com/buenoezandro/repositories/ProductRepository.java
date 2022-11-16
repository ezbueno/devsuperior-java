package com.buenoezandro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buenoezandro.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
