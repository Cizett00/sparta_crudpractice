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

    //주문 테이블

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private LocalDate orderdate;

    //상품 id를 주문정보 안에 넣어 상품 이름이 바뀔때 주문정보에서도 수정되도록 함
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order(Product product, LocalDate orderdate){
        this.product=product;
        this.orderdate=orderdate;
    }
}
