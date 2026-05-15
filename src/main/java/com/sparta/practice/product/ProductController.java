package com.sparta.practice.product;

import com.sparta.practice.product.dto.ProductCreateDto;
import com.sparta.practice.product.dto.ProductResponseDto;
import com.sparta.practice.product.dto.ProductUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductController {
    //테스트용 주석

    private final ProductService productService;

    @PostMapping("/product/save")
    public Long save(@RequestBody ProductCreateDto productCreateDto){
        return productService.save(productCreateDto);
    }

    @PutMapping("/product/update/{id}")
    public Long update(@PathVariable Long id, @RequestBody ProductUpdateDto productUpdateDto){
        return productService.update(id, productUpdateDto);
    }

    @GetMapping("/product/get/{id}")
    public ProductResponseDto findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @DeleteMapping("/product/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.delete(id);

        return;
    }
}
