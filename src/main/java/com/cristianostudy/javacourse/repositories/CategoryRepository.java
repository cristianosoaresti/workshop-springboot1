package com.cristianostudy.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianostudy.javacourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}