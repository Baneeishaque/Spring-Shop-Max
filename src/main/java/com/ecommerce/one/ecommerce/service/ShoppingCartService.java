package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.exception.NotEnoughProductException;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {
    void addProduct(product product);

    void removeProduct(product product);

    Map<product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductException;

    BigDecimal getTotal();
}
