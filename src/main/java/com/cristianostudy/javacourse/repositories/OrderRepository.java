package com.cristianostudy.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianostudy.javacourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}