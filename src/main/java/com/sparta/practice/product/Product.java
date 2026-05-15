//package com.sparta.practice.product;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Getter
//@NoArgsConstructor
//@Entity
//public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String name;
    private int price;

    @Builder
    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void update(String name, int price){
        this.name = name;
        this.price = price;
    }

//}
