package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("ViewProduct")
    public String listPage(Model model) {

        List<product> allProducts = productService.findAllProducts();
        model.addAttribute("product", allProducts);
        return "/AdminProductView";
    }

    @RequestMapping("shopSingle")
    public String shopSingle(@RequestParam("id") Integer id) {

        productService.getById(id);

        return "shop-single";}

    @GetMapping("shop")
    public String listProduct(Model model){
        List<product> allProducts = productService.findAllProducts();
        model.addAttribute("product", allProducts);
        return "/shop";
    }

    @GetMapping("addProduct")
    public String addPage(Model model) {

        model.addAttribute("product", new product());
        return "/AddProduct";
    }

    @PostMapping("saveProduct")
    public String saveProduct(product product, MultipartFile file) throws IOException {
        byte[] image = file.getBytes();
        product.setImage(image);
        product.setContnttype(file.getContentType());
        productService.saveOrUpdate(product);
        return "redirect:/ViewProduct";
    }

    @GetMapping("editProduct")
    public String editProduct(@RequestParam("id") Integer id, Model model) {

        product product = productService.getById(id);
        model.addAttribute("product", new product());
        return "/AddProduct";
    }

    @GetMapping("deleteProduct")
    public String deletePage(@RequestParam("id") Integer id) {
        productService.deleteProduct(id);
        return "redirect:/ViewProduct";
    }

    @GetMapping(value = "/image/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable("id") Integer id) {
        product prd = productService.getById(id);
        byte[] image = prd.getImage();
        String contentType =prd.getContnttype();
        return ResponseEntity.ok().contentType(MediaType.valueOf(contentType)).body(image);
    }

    @GetMapping("shopSingle")
    public String detailsPage(@RequestParam("prodID") Integer id){
        productService.getById(id);
        return "shop-single";
    }
}

