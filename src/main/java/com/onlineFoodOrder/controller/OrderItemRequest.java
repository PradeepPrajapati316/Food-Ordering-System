package com.onlineFoodOrder.controller;

public class OrderItemRequest {
	private Long itemId;
    private int quantity;
    
    public int getQuantity() {
        return quantity;
    }
    
    public Long getItemId() {
        return itemId;
    }

    // Other fields and getters/setters
}
