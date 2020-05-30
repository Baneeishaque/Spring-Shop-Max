package com.ecommerce.one.ecommerce.repository;

import com.ecommerce.one.ecommerce.domain.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<product, Long> {
    Optional<product> findById(Long id);
}
