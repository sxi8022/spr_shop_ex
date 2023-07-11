package com.sparta.myselectshop.exception;

// 커스텀 예외 처리
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
