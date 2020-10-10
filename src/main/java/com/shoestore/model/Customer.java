package com.shoestore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data

public class Customer {

	private String fullName;
	@Id
	private int phoneNo;
	private String emailId;
	private String address;
	private String pass;

}
