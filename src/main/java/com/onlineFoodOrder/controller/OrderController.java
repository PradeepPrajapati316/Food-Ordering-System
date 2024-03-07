package com.onlineFoodOrder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineFoodOrder.Service.OrderService;
import com.onlineFoodOrder.entities.Order;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.createOrder(orderRequest);
    }
    
    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId) {
        return orderService.getOrderById(orderId);
    }
    
    @GetMapping("/{orderId}/total-price")
    public double getTotalPrice(@PathVariable Long orderId) {
        Order order = orderService.getOrderById(orderId);
        return orderService.calculateTotalPrice(order);
    }

    // Other order-related endpoints
}

