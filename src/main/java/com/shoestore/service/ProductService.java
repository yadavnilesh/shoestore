package com.shoestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoestore.model.Product;
import com.shoestore.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo pr;

	Product product;

	public List<Product> products() {
		return pr.findAll();
	}

	public Product addProduct(Product p) {
		return pr.save(p);
	}

	public Product product(int id) {
		return pr.findById(id).orElse(null);
	}

	public Integer deleteProduct(int id) {
		try {
			pr.deleteById(id);
			return id;
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

}
