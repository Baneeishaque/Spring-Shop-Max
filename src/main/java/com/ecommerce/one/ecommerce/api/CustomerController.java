package com.ecommerce.one.ecommerce.api;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("view")
    public String listPage(Model model){
        List<customer> allCustomers = customerService.findAllProducts();
        model.addAttribute("customer", allCustomers);
        return "Demo/customerregisterview";
    }
}