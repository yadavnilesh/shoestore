package com.shoestore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoestore.model.Customer;

public interface CustomerrRepo extends JpaRepository<Customer, Integer> {

	Customer findByEmailId(String emailId);

	Customer findByPhoneNoAndPass(int phoneNo, String pass);

}
