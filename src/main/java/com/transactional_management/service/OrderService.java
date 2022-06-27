package com.transactional_management.service;

import com.transactional_management.dto.OrderRequest;
import com.transactional_management.dto.OrderResponse;


public interface OrderService {

    OrderResponse placeOrder(OrderRequest orderRequest);
}
