package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;

@GetMapping("shop")
    public String listPage(Model model){
        List<product> allProducts = productService.findAllProducts();
        model.addAttribute("product", allProducts);
        return "/shop";
    }

    @GetMapping("add")
    public String addPage(Model model) {
        model.addAttribute("product", new product());

        return "Demo/add-product";
    }


}
