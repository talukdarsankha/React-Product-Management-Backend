package com.xyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
