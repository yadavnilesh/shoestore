package com.shoestore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoestore.model.Customer;
import com.shoestore.service.CustomerService;

@SpringBootTest
class ShoestoreApplicationTests {

	@Autowired
	CustomerService cs;
	

	@Test
	void testcustomer() {
	
		Customer ac=new Customer();
		ac.setEmailId("nileshyadav6633@gmail.com");
		Customer ex=cs.login(121, "121");
		
		assertEquals(ex.getEmailId(), ac.getEmailId(), "not matching");
	}
	@Test
	void tescustomer() {
	
		Customer ac=new Customer();
		ac.setEmailId("nileshyadav6633@gmail.com");
		Customer ex=cs.login(121, "121");
		
		assertEquals(ex.getEmailId(), ac.getEmailId(), "not matching");
	}
}
