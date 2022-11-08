package com.buenoezandro.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buenoezandro.entities.Order;
import com.buenoezandro.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	private final OrderService orderService;

	public OrderResource(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = this.orderService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = this.orderService.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
