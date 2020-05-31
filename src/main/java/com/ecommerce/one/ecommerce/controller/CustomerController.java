package com.ecommerce.one.ecommerce.controller;

import com.ecommerce.one.ecommerce.domain.admin;
import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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

    @PostMapping("accessCustomer")
    public String loginUser(customer customer, BindingResult bind) {
        customer cust = customerService.accessCustomer(customer.getUsername(), customer.getPasswords());
        if (cust == null){
            bind.rejectValue("username","Customer not registered");
        }
        if (bind.hasErrors()){
            return "login";
        }
        return "index";
    }
    @PostMapping("adminLogin")
    public String adminlogin(admin admin, BindingResult bind) {
        admin adn = customerService.adminLogin(admin.getAdminname(), admin.getAdminpassword());
        if (adn == null){
            bind.rejectValue("Adminname","Admin not registered");
        }
        if (bind.hasErrors()){
            return "adminLogin";
        }
        return "AdminProductView";
    }
}


