package com.cristianostudy.javacourse.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristianostudy.javacourse.entities.Product;
import com.cristianostudy.javacourse.services.ProductService;


// to inform that this class is a WEB RESOURCE, we need to use the annotation bellow
@RestController
// To give a name to the resource ("URL name")
@RequestMapping(value = "/products")
public class ProductResouce {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = productService.findById(id);
		return ResponseEntity.ok().body(product);
	}
}