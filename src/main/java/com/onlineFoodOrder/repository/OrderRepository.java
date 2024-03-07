package com.onlineFoodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineFoodOrder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	// Add a method to retrieve an order by its ID
    Order findById(long id);
}