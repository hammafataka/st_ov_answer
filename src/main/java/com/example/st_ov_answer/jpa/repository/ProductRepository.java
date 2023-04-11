package com.example.st_ov_answer.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.st_ov_answer.jpa.domain.Product;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 2:52
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
