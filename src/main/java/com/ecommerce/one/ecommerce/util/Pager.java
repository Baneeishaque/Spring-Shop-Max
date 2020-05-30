package com.ecommerce.one.ecommerce.util;


import com.ecommerce.one.ecommerce.domain.product;
import org.springframework.data.domain.Page;

/**
 * @author Dusan Raljic
 */
public class Pager {

    private final Page<product> products;

    public Pager(Page<product> products) {
        this.products = products;
    }

    public int getPageIndex() {
        return products.getNumber() + 1;
    }

    public int getPageSize() {
        return products.getSize();
    }

    public boolean hasNext() {
        return products.hasNext();
    }

    public boolean hasPrevious() {
        return products.hasPrevious();
    }

    public int getTotalPages() {
        return products.getTotalPages();
    }

    public long getTotalElements() {
        return products.getTotalElements();
    }

    public boolean indexOutOfBounds() {
        return this.getPageIndex() < 0 || this.getPageIndex() > this.getTotalElements();
    }

}