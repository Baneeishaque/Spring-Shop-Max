package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("saveCustomer")
    public String saveCustomer(customer customer) {
        customerService.save(customer);
        return "redirect:/index";
    }

    @PostMapping("access")
    public String loginUser(customer customer, BindingResult bind) {
        customer cust = customerService.accessUser(customer.getCustomeriid(), customer.getUsername(), customer.getPasswords());
        if (cust == null){
            bind.rejectValue("username","Customer not registered");
        }
        if (bind.hasErrors()){
            return "login";
        }
        return "index";
    }

    @GetMapping("profile")
    public String userProfile() {
        return "account";
    }
}


