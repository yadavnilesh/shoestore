package com.shoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoestore.model.Customer;
import com.shoestore.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;

	@PostMapping("/login")
	public Customer login(@RequestBody Customer user) {
		//System.out.println(user);
		return cs.login(user.getPhoneNo(), user.getPass());
	}

	@PostMapping("/signup")
	public ResponseEntity<Customer> signup(@RequestBody Customer c) {
		return new ResponseEntity<Customer>(cs.signup(c), HttpStatus.OK);
		
	}
}
