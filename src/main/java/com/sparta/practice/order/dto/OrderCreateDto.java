package com.sparta.practice.order.dto;

import com.sparta.practice.order.Order;
import com.sparta.practice.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class OrderCreateDto {
    //테스트용 주석

    private LocalDate orderdate;
    private Long productId;

    public Long getProductId() {
        return productId;
    }
}
