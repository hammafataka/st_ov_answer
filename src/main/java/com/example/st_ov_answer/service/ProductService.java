package com.example.st_ov_answer.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.st_ov_answer.jpa.domain.Comment;
import com.example.st_ov_answer.jpa.domain.Product;
import com.example.st_ov_answer.jpa.repository.ProductRepository;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 2:54
 */
@Service
public class ProductService {
    private final ProductRepository productRepository;


    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void saveProduct() {
        final var productDto = new Product("my product", "my description", List.of(new Comment("my content")));
        productRepository.save(productDto);
    }
}
