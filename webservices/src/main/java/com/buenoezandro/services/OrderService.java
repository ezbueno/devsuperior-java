package com.buenoezandro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buenoezandro.entities.Order;
import com.buenoezandro.repositories.OrderRepository;

@Service
public class OrderService {
	private final OrderRepository orderRepository;

	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public List<Order> findAll() {
		return this.orderRepository.findAll();
	}

	public Order findById(Long id) {
		return this.orderRepository.findById(id).orElse(null);
	}
}
