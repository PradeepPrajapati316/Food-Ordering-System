package com.onlineFoodOrder.controller;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
	private List<OrderItemRequest> orderItems;

    // Other fields 
}
