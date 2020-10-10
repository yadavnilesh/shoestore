package com.shoestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoestore.model.Product;
import com.shoestore.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	ProductService ps;

	@GetMapping("/product")
	ResponseEntity<List<Product>> products() {
		return ResponseEntity.status(HttpStatus.OK).body(ps.products());
	}

	@GetMapping("/product/{id}")
	ResponseEntity<Product> product(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.OK).body(ps.product(id));
	}

	@PostMapping("/product")
	ResponseEntity<Product> addProduct(@RequestBody Product p) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ps.addProduct(p));
	}

	@DeleteMapping("/product{id}")
	ResponseEntity<Integer> deleteProduct(int id) {
		return ResponseEntity.status(HttpStatus.OK).body(ps.deleteProduct(id));
	}

}
