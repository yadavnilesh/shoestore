package com.shoestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.shoestore.model.Image;
import com.shoestore.service.ImageService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ImageController {

	@Autowired
	ImageService is;

	@GetMapping("/product/{id}/images")
	ResponseEntity<List<Image>> productImages(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.OK).body(is.productImages(id));
	}

	@PostMapping(value = "/product/{id}/images", consumes = { "multipart/form-data" })
	ResponseEntity<List<Image>> addproductImages(@PathVariable int id,
			@RequestParam("image") MultipartFile[] imageFile) {
		return ResponseEntity.status(HttpStatus.OK).body(is.addProductImages(id, imageFile));
	}

}
