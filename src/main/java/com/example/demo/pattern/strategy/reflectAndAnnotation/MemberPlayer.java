package com.example.demo.pattern.strategy.reflectAndAnnotation;

import org.springframework.stereotype.Service;

/*
    会员9折
 */
@Service("memberPlayer")
@PriceRegion(max = 20000, min = 10000)
public class MemberPlayer implements CallPrice {
    @Override
    public double callPrice(double price) {
        return price * 0.9;
    }
}
