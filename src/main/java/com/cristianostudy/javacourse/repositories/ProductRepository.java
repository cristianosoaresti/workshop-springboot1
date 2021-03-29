package com.cristianostudy.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianostudy.javacourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}