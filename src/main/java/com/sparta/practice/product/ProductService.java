package com.sparta.practice.product;

import com.sparta.practice.product.dto.ProductCreateDto;
import com.sparta.practice.product.dto.ProductResponseDto;
import com.sparta.practice.product.dto.ProductUpdateDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {
//
//    private final ProductRepository productRepository;
//
//    @Transactional
//    public Long save(ProductCreateDto productCreateDto){
//        return productRepository.save(productCreateDto.toEntity()).getId();
//    }
//
//    @Transactional
//    public Long update(Long id, ProductUpdateDto productUpdateDto){
//        Product product = productRepository.findById(id)
//                .orElseThrow(()-> new IllegalArgumentException("product doesn't exist"));
//        product.update(productUpdateDto.getName(), productUpdateDto.getPrice());
//        return id;
//    }
//
//    public ProductResponseDto findById(Long id) {
//        Product entity = productRepository.findById(id)
//                .orElseThrow(()-> new IllegalArgumentException("product doesn't exist"));
//        return new ProductResponseDto(entity);
//    }
//
//    @Transactional
//    public void delete(Long id){
//        Product product = productRepository.findById(id)
//                .orElseThrow(()-> new IllegalArgumentException("product doesn't exist"));
//        productRepository.delete(product);
//    }
}
