package com.shoestore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoestore.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
