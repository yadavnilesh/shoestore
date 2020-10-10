package com.shoestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoestore.model.Category;
import com.shoestore.repo.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo cr;

	public Category addCategory(Category c) {

		return cr.save(c);

	}

	public Integer deleteCategory(int id) {

		try {
			cr.deleteById(id);
			return id;
		} catch (Exception e) {
			return null;
		}
	}

	public List<Category> categories() {

		return cr.findAll();
	}

	public Category category(int id) {

		return cr.findById(id).orElse(null);
	}
}
