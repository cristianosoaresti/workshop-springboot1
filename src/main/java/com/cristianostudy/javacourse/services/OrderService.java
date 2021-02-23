package com.cristianostudy.javacourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianostudy.javacourse.entities.Order;
import com.cristianostudy.javacourse.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> optionalOrder = orderRepository.findById(id);
		return optionalOrder.get();
	}
}
