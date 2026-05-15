package com.sparta.practice.order;


import com.sparta.practice.product.Product;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "orders") //DB문제를 피하기 위해 orders로 테이블 저장
public class Order {

//
//    @Id
//    @GeneratedValue(strategy =  GenerationType.IDENTITY)
//    private Long id;
//    private LocalDate orderdate;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//    public Order(Product product, LocalDate orderdate){
//        this.product=product;
//        this.orderdate=orderdate;
//    }
}
