package com.example.demo.mock;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cal {

    public static void main(String[] args) {
        BigDecimal p = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            p = p.add(new BigDecimal("10000"));
            BigDecimal one = p.multiply(new BigDecimal(0.031)).setScale(2,BigDecimal.ROUND_HALF_UP);
            System.out.println(String.format("第%s年，本金%s, 利息%s", i+1, p.toPlainString(), one.toPlainString()));
            p = p.add(one);
        }
        for (int i = 11; i < 14; i++) {
            BigDecimal one = p.multiply(new BigDecimal(0.031)).setScale(2,BigDecimal.ROUND_HALF_UP);
            p = p.add(one);
            System.out.println(String.format("第%s年，本金%s, 利息%s", i, p.toPlainString(), one.toPlainString()));
        }
        System.out.println("总的本息和：" + p.toPlainString());
    }
}
