package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.ShoppingCart;
import com.ecommerce.one.ecommerce.domain.ShoppingCartExample;
import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.mapper.ShoppingCartMapper;
import com.ecommerce.one.ecommerce.mapper.productMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private productMapper prdMapper;
    private ShoppingCart shoppingCart;

    public List<ShoppingCart> findAllProducts() {
        return shoppingCartMapper.selectByExample(new ShoppingCartExample());
    }

    public void addToCart(ShoppingCart shoppingCart) {
        shoppingCartMapper.insert(shoppingCart);
    }

    public List<product> productInfo(Integer id) {
        List<product> prods = prdMapper.getProductsByCustomerId(id);
        return prods;
//        return shoppingCartMapper.getShoppingCartByCustomerId(id);
    }

//    BigDecimal getCartTotalprice();
}
