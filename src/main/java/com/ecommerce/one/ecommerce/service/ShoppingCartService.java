package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.ShoppingCart;
import com.ecommerce.one.ecommerce.domain.ShoppingCartExample;
import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.mapper.ShoppingCartMapper;
import com.ecommerce.one.ecommerce.mapper.productMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShoppingCartService {

    private Map<product, Integer> products = new HashMap<>();

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private productMapper prdMapper;


    public List<ShoppingCart> findAllProducts() {
        return shoppingCartMapper.selectByExample(new ShoppingCartExample());
    }

    public void removeProduct(Long id) {
        shoppingCartMapper.deleteByPrimaryKey(id);
    }

    public void addToCart(ShoppingCart shoppingCart) {
        shoppingCartMapper.insert(shoppingCart);
    }

    public List<product> productInfo(Integer id) {
        List<product> prods = prdMapper.getProductsByCustomerId(id);
        return prods;
    }
}
