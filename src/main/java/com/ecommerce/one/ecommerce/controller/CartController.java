package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.service.CartItemService;
import com.ecommerce.one.ecommerce.service.CartService;
import com.ecommerce.one.ecommerce.service.CustomerService;
import com.ecommerce.one.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;


    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public CartService getCartService() {
        return cartService;
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }

    public CartItemService getCartItemService() {
        return cartItemService;
    }

    public void setCartItemService(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }




}
