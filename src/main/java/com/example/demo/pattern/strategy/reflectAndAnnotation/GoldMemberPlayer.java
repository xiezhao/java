package com.example.demo.pattern.strategy.reflectAndAnnotation;

import org.springframework.stereotype.Service;

/*
    金牌会员 7折
 */
@Service("goldMemberPlayer")
@PriceRegion(min = 30000)
public class GoldMemberPlayer implements CallPrice {
    @Override
    public double callPrice(double price) {
        return price * 0.7;
    }
}
