package com.sparta.practice.product.dto;

import com.sparta.practice.product.Product;
import lombok.Getter;

@Getter
public class ProductResponseDto {
    //테스트용 주석

    private Long id;
    private String name;
    private int price;

    public ProductResponseDto(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }
}
