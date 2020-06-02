package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.wishlist;
import com.ecommerce.one.ecommerce.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @GetMapping("wishlist")
    public String wishlist(Model model, product Product){
        List<wishlist> wishListProducts = wishListService.findAllProducts();
        model.addAttribute("wishlist", wishListProducts);
        return "whishlist";
    }

    @GetMapping("/saveToWishlist")
    public String addToWishlist (@RequestParam("prodId") Integer prodId, HttpSession session) {
        wishlist wishList = new wishlist();
        wishList.setProductid(prodId);
        customer user = (customer) session.getAttribute("user");
        wishList.setCustomeriid(user.getCustomeriid());
        wishListService.addToWishList(wishList);
        return "redirect:/shop";
    }
}
