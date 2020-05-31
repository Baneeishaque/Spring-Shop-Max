//package com.ecommerce.one.ecommerce.service.impl;
//
//import com.ecommerce.one.ecommerce.domain.product;
//import com.ecommerce.one.ecommerce.repository.ProductRepository;
//import com.ecommerce.one.ecommerce.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//    private final ProductRepository productRepository;
//
//    @Autowired
//    public ProductServiceImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public Page<product> findAllProductsPageable(Pageable pageable) {
//        return productRepository.findAll(pageable);
//    }
//
//    @Override
//    public Optional<product> findById(Long id) {
//        return productRepository.findById(id);
//    }
//}
