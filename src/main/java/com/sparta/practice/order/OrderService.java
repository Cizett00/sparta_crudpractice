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

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    @Transactional
    public Long save(OrderCreateDto orderCreateDto){
        Product product = productRepository.findById(orderCreateDto.getProductId())
                .orElseThrow(() -> new IllegalArgumentException("product doesn't exist"));

        Order order = new Order(product, orderCreateDto.getOrderdate());

        return orderRepository.save(order).getId();
    }

    public OrderResponseDto findById(Long id) {
        Order entity = orderRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("order doesn't exist"));
        return new OrderResponseDto(entity);
    }
}
