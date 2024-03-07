package com.onlineFoodOrder.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineFoodOrder.Service.OrderItemService;
import com.onlineFoodOrder.entities.OrderItem;
import com.onlineFoodOrder.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }
    // Other order item-related methods
}

