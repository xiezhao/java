package com.example.demo.pattern.strategy.reflectAndAnnotation;

import org.springframework.stereotype.Service;

/*
    普通顾客，原价
 */
@Service("ordinaryPlayer")
@PriceRegion(max = 10000)
public class OrdinaryPlayer implements CallPrice {
    @Override
    public double callPrice(double price) {
        return price;
    }
}
