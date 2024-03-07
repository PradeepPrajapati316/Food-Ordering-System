package com.onlineFoodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineFoodOrder.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Additional queries, if needed
}
