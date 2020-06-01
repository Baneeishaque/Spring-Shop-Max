package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.ShoppingCart;
import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.wishlist;
import com.ecommerce.one.ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("cart")
    public String wishlist(Model model){
        List<ShoppingCart> cartProducts = shoppingCartService.findAllProducts();
        model.addAttribute("shoppingCart", cartProducts);
        return "cart";
    }

    @GetMapping("addToCart")
    public String addToCart (@RequestParam("prodId") Integer prodId, HttpSession session) {
        ShoppingCart Product = new ShoppingCart();
        Product.setProductid(prodId);
        customer user = (customer) session.getAttribute("user");
        Product.setCustomeriid(user.getCustomeriid());
        shoppingCartService.addToCart(Product);
        return "cart";
    }
}
