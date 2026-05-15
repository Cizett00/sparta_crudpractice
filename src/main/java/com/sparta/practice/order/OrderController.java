package com.sparta.practice.order;

import com.sparta.practice.order.OrderService;
import com.sparta.practice.order.dto.OrderCreateDto;
import com.sparta.practice.order.dto.OrderResponseDto;
import com.sparta.practice.product.dto.ProductCreateDto;
import com.sparta.practice.product.dto.ProductResponseDto;
import com.sparta.practice.product.dto.ProductUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class OrderController {

    //테스트용 주석

    private final OrderService orderService;

    @PostMapping("/order/save")
    public Long save(@RequestBody OrderCreateDto orderCreateDto){
        return orderService.save(orderCreateDto);
    }

    @GetMapping("/order/get/{id}")
    public OrderResponseDto findById(@PathVariable Long id){
        return orderService.findById(id);
    }

}
