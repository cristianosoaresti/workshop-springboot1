package com.cristianostudy.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianostudy.javacourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}