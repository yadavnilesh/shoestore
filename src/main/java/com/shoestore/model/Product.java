package com.shoestore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue
	private int productId;
	private String name;
	private int price;
	private int quantity;
	private String size;
	@ManyToOne
	private Category category;
	@OneToMany
	private List<Review> review;

}
