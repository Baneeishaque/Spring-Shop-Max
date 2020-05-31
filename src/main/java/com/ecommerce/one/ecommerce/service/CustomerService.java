package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.domain.customerExample;
import com.ecommerce.one.ecommerce.mapper.customerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    @Autowired
    private customerMapper customermapper;

    public customer getById(Integer id) {
        return customermapper.selectByPrimaryKey(id);
    }

    public void save(customer Customer) {
        if (Customer.getUsername() != null) {
            customermapper.insert(Customer);
        }
    }

    public customer accessCustomer( String username, String password) {

        return customermapper.findCustomer(username, password);
    }
}
