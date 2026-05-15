package com.sparta.practice.product.dto;

import com.sparta.practice.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductCreateDto {
    //테스트용 주석

//    private Long id;
    private String name;
    private int price;

    public Product toEntity(){
        return Product.builder()
//                .id(id)
                .name(name)
                .price(price)
                .build();
    }
}
