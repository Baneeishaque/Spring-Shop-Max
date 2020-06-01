package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.wishlist;
import com.ecommerce.one.ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.List;

public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("cart")
    public String wishlist(Model model, product Product){
        List<product> cartProducts = cartService.findAllProducts();
        model.addAttribute("wishlist", cartProducts);
        return "cart";
    }

    @GetMapping("addToCart")
    public String addToCart (@RequestParam("prodId") Integer prodId, HttpSession session) {
        product Product = new product();
        Product.setProductid(prodId);
        customer user = (customer) session.getAttribute("user");

        Product.setProductid(user.getCustomeriid());

        cartService.addToCart(Product);

        return "cart";
    }
}
