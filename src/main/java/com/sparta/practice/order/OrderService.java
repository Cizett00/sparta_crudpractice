package com.sparta.practice.order;

import com.sparta.practice.order.dto.OrderCreateDto;
import com.sparta.practice.order.dto.OrderResponseDto;
import com.sparta.practice.product.Product;
import com.sparta.practice.product.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderService {
    //테스트용 주석

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    //주문 저장
    @Transactional
    public Long save(OrderCreateDto orderCreateDto){
        Product product = productRepository.findById(orderCreateDto.getProductId())
                .orElseThrow(() -> new IllegalArgumentException("product doesn't exist"));

        Order order = new Order(product, orderCreateDto.getOrderdate());

        return orderRepository.save(order).getId();
    }

    //주문 조회
    public OrderResponseDto findById(Long id) {
        Order entity = orderRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("order doesn't exist"));
        return new OrderResponseDto(entity);
    }
}
