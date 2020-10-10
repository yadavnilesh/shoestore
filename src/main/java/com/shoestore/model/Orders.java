package com.shoestore.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int id;
	private Date date;
	@ManyToOne
	private Product product;
	@ManyToOne
	private Customer customer;

}
