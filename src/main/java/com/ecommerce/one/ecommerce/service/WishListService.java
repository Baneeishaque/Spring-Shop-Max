package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.wishlist;
import com.ecommerce.one.ecommerce.domain.wishlistExample;
import com.ecommerce.one.ecommerce.mapper.wishlistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private wishlistMapper WishlistMapper;



    public List<wishlist> findAllProducts() {

            return WishlistMapper.selectByExample(new wishlistExample());
    }

    public void addToWishList(wishlist WishList){

        WishlistMapper.insert(WishList);
    }
}
