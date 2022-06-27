package com.transactional_management.dto;

import com.transactional_management.entity.Order;
import com.transactional_management.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private Order order;
    private Payment payment;

}
