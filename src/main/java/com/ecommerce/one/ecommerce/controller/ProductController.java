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
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

@GetMapping("b")
    public String listPage(Model model){
        List<product> allProducts = productService.findAllProducts();
        model.addAttribute("product", allProducts);
        return "Demo/product-view";
    }

    @GetMapping("add")
    public String addPage(Model model) {
        model.addAttribute("product", new product());

        return "Demo/add-product";
    }

    @PostMapping("save")
    public String saveProduct(product product) {
        productService.saveOrUpdate(product);

        return "redirect:/product/b";
    }

    @GetMapping("edit")
    public String editPage(@RequestParam("id") Integer id, Model model) {
        product product = productService.getById(id);

        model.addAttribute("product", product);

        return "Demo/add-product";
    }

    @GetMapping("delete")
    public String deletePage(@RequestParam("id") Integer id) {
        productService.deleteProduct(id);

        return "redirect:/product/b";
    }
}
