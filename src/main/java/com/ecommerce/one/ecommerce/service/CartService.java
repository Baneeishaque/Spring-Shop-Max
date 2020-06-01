package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.productExample;
import com.ecommerce.one.ecommerce.domain.wishlist;
import com.ecommerce.one.ecommerce.mapper.productMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartService {
    @Autowired
    private productMapper ProductMapper;

    public List<product> findAllProducts() {
        return ProductMapper.selectByExample(new productExample());
    }
    public void addToCart(product prod){
        ProductMapper.insert(prod);
    }
}
