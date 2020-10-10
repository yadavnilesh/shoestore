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

import com.shoestore.model.Category;
import com.shoestore.service.CategoryService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController//@Controller+@ResponseBody
public class CategoryController {

	@Autowired
	CategoryService cs;

	@GetMapping("/category")//@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Category>> categories() {

		return ResponseEntity.status(HttpStatus.OK).body(cs.categories());
	}

	@GetMapping("/category/{id}")
	public ResponseEntity<Category> category(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.OK).body(cs.category(id));
	}

	@PostMapping("/category")
	public ResponseEntity<Category> addCategory(@RequestBody Category c) {
		return ResponseEntity.status(HttpStatus.CREATED).body(cs.addCategory(c));
	}

	@DeleteMapping("/category/{id}")
	public ResponseEntity<Integer> deleteCategory(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.OK).body(cs.deleteCategory(id));
	}

}
