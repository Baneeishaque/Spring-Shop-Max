package com.ecommerce.one.ecommerce.service;
import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.productExample;
import com.ecommerce.one.ecommerce.mapper.productMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class ProductService {
    public abstract Optional<product> findById(Long id);

    public abstract Page<product> findAllProductsPageable(Pageable pageable);
    @Autowired
    private productMapper productMapper;

    public List<product> findAllProducts() {
        return productMapper.selectByExample(new productExample());
    }

    public product getById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    public void deleteProduct(Integer id) {
        productMapper.deleteByPrimaryKey(id);
    }

    public void saveOrUpdate(product prod) {
        if (prod.getProductid() != null) {
            productMapper.updateByPrimaryKey(prod);
            productMapper.updateByPrimaryKeyWithBLOBs(prod);
        } else {
            productMapper.insert(prod);
        }
    }



}
