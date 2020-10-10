package com.shoestore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoestore.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
