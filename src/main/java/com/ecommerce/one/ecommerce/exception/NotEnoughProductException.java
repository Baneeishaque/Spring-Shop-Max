//package com.ecommerce.one.ecommerce.exception;
//
//import com.ecommerce.one.ecommerce.domain.product;
//
//public class NotEnoughProductException extends Throwable {
//    private static final String DEFAULT_MESSAGE = "Not enough products in stock";
//
//    public NotEnoughProductException() {
//        super(DEFAULT_MESSAGE);
//    }
//
//    public NotEnoughProductException(product product) {
//        super(String.format("Not enough %s products in stock. Only %d left", product.getName(), product.getQuantity()));
//    }
//
//}
