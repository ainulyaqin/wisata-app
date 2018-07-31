package com.wisata.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wisata.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
