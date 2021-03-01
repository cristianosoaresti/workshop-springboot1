package com.cristianostudy.javacourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianostudy.javacourse.entities.Category;
import com.cristianostudy.javacourse.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		return optionalCategory.get();
	}
}
