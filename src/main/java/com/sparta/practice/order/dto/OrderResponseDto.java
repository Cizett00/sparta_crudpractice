package com.sparta.practice.order.dto;

import com.sparta.practice.order.Order;
import com.sparta.practice.product.Product;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class OrderResponseDto {
    private Long id;
    private LocalDate orderdate;
    private String productName;

    public OrderResponseDto(Order entity) {
        this.id = entity.getId();
        this.orderdate = entity.getOrderdate();
        this.productName = entity.getProduct().getName();
    }
}
