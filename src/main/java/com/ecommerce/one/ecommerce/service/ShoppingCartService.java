package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.exception.NotEnoughProductsInStockException;
import com.ecommerce.one.ecommerce.domain.product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(product product);

    void removeProduct(product product);

    Map<product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
