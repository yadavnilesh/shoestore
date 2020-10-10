package com.shoestore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoestore.model.Image;
import com.shoestore.model.Product;

public interface ImageRepo extends JpaRepository<Image, Integer> {

	List<Image> findByProduct(Product product);
}
