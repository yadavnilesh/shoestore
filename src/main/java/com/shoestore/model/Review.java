package com.shoestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Review {

	@Id
	@GeneratedValue
	private int id;
	private int rating;
	private String review;
	@ManyToOne
	private Customer customer;
}
