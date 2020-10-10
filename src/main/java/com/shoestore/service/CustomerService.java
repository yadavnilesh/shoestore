package com.shoestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoestore.model.Customer;
import com.shoestore.repo.CustomerrRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerrRepo cr;

	public Customer login(int phoneNo, String pass) {

		Customer c = cr.findByPhoneNoAndPass(phoneNo, pass);
		System.out.println(c);
		return c;
	}

	public Customer signup(Customer c) {
		return cr.save(c);
	}
}
