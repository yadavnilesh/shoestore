package com.shoestore.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shoestore.model.Image;
import com.shoestore.model.Product;
import com.shoestore.repo.ImageRepo;

@Service
public class ImageService {

	@Autowired
	ImageRepo ir;

	@Autowired
	ProductService ps;
	Product product;
	private List<Image> imageList;

	public List<Image> addProductImages(int id, MultipartFile[] imageFile) {
		imageList = new ArrayList<Image>();
		product = ps.product(id);
		try {
			for (int i = 0; i < imageFile.length; i++) {
				Image image = new Image();
				String base64img = new String(Base64.encodeBase64(imageFile[i].getBytes()), "UTF-8");
				image.setNewImage(base64img);
				imageList.add(image);
				image.setProduct(product);
				ir.save(image);
			}
			return imageList;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<Image> productImages(int id) {
		Product product = new Product();
		product.setProductId(id);
		return imageList = ir.findByProduct(product);

	}
}
