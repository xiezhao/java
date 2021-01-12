package com.example.demo.pattern.strategy.reflectAndAnnotation;

import org.springframework.stereotype.Service;

/*
    超级会员 8折
 */
@Service("superMemberPlayer")
@PriceRegion(max = 30000, min = 20000)
public class SuperMemberPlayer implements CallPrice {
    @Override
    public double callPrice(double price) {
        return price * 0.8;
    }
}
