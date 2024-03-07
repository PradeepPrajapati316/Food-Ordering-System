package com.onlineFoodOrder.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineFoodOrder.Service.MenuService;
import com.onlineFoodOrder.Service.OrderItemService;
import com.onlineFoodOrder.Service.OrderService;
import com.onlineFoodOrder.controller.OrderItemRequest;
import com.onlineFoodOrder.controller.OrderRequest;
import com.onlineFoodOrder.entities.Menu;
import com.onlineFoodOrder.entities.Order;
import com.onlineFoodOrder.entities.OrderItem;
import com.onlineFoodOrder.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private OrderItemService orderItemService;
    
    @Autowired
    private MenuService menuService;

    @Override
    public Order createOrder(OrderRequest orderRequest) {
        Order order = orderRepository.save(new Order());

        double totalPrice = 0.0;

        for (OrderItemRequest itemRequest : orderRequest.getOrderItems()) {
            Menu menu = menuService.getItemById(itemRequest.getItemId());
            OrderItem orderItem = new OrderItem(order, menu, itemRequest.getQuantity());
            orderItemService.createOrderItem(orderItem);

            // Calculate the subtotal for each item and accumulate to the total price
            totalPrice += menu.getPrice() * itemRequest.getQuantity();
        }

        order.setTotalPrice(totalPrice);
        orderRepository.save(order);

        return order;
    }
    
    @Override
    public double calculateTotalPrice(Order order) {
        // Implement logic to calculate the total price for an existing order
        // You may iterate through order items and accumulate the subtotal
        // Or you can use a more efficient method based on your application's needs
        return order.getOrderItems().stream()
                .mapToDouble(item -> item.getMenu().getPrice() * item.getQuantity())
                .sum();
    }
    
    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }
    // Other order-related methods
}
