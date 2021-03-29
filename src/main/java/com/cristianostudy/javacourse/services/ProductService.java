package com.cristianostudy.javacourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianostudy.javacourse.entities.Product;
import com.cristianostudy.javacourse.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id){
		Optional<Product> optionalProduct = productRepository.findById(id);
		return optionalProduct.get();
	}
}
