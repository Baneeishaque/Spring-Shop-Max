package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.domain.customerExample;
import com.ecommerce.one.ecommerce.mapper.customerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private customerMapper customermapper;

    public List<customer> findAllProducts() {
        return customermapper.selectByExample(new customerExample());
    }

    public customer getById(Integer id) {
        return customermapper.selectByPrimaryKey(id);
    }

    public void deleteProduct(Integer id) {
        customermapper.deleteByPrimaryKey(id);
    }

    public void saveOrUpdate(customer cust) {
        if (cust.getCustomerId() != null) {
            customermapper.updateByPrimaryKey(cust);
        } else {
            customermapper.insert(cust);
        }
    }

}
