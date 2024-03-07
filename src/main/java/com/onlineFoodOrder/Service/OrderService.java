package com.onlineFoodOrder.Service;

import com.onlineFoodOrder.controller.OrderRequest;
import com.onlineFoodOrder.entities.Order;

import java.util.List;

public interface OrderService {
	
	Order createOrder(OrderRequest orderRequest);
    double calculateTotalPrice(Order order);
    Order getOrderById(Long orderId);
    // Other order-related methods
}

