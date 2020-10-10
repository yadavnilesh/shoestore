package com.shoestore.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Data
public class Image {

	@Id
	@GeneratedValue
	private int id;
	@Column(columnDefinition = "LONGTEXT")
	private String newImage;
	@ManyToOne(cascade = { CascadeType.ALL })
	private Product product;
}
