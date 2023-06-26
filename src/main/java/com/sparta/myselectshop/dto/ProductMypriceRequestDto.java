package com.sparta.myselectshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMypriceRequestDto {
    private int myprice;

    public int getMyprice() {
        return myprice;
    }
}