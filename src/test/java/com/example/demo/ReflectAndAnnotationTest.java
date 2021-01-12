package com.example.demo;

import com.example.demo.pattern.strategy.reflectAndAnnotation.CallPrice;
import com.example.demo.pattern.strategy.reflectAndAnnotation.PriceFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReflectAndAnnotationTest {

    @Autowired
    private PriceFactory priceFactory;

    @Test
    public void test(){
        try {
            CallPrice callPrice = priceFactory.getCallPrice(21000);
            System.out.println(callPrice.callPrice(21000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
