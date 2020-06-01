package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.ShoppingCart;
import com.ecommerce.one.ecommerce.domain.ShoppingCartExample;
import com.ecommerce.one.ecommerce.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    public List<ShoppingCart> findAllProducts() {
        return shoppingCartMapper.selectByExample(new ShoppingCartExample());
    }

    public void addToCart(ShoppingCart shoppingCart){
        shoppingCartMapper.insert(shoppingCart);
    }

}
