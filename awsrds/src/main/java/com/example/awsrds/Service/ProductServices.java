package com.example.awsrds.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.awsrds.Repository.ProductRepository;
import com.example.awsrds.Resourse.Product;

@Service
public class ProductServices {
	@Autowired
	ProductRepository productRepository;
	public Product add(Product product) {
		return productRepository.save(product);
		
		
		
	}

}
