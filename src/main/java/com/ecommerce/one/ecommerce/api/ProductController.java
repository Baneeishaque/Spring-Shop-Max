package com.ecommerce.one.ecommerce.api;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
@GetMapping("view")
    public String listPage(Model model){
        List<product> allProducts = productService.findAllProducts();
        model.addAttribute("product", allProducts);

        return "product/product-view";
    }

}
