package com.example.demo.pattern.strategy.reflectAndAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceFactory {

    private static List<CallPrice> callPriceList;

    public CallPrice getCallPrice(double price) throws Exception {
        for (CallPrice callPrice : callPriceList) {
            PriceRegion priceRegion = callPrice.getClass().getAnnotation(PriceRegion.class);
            if (priceRegion.max() > price && priceRegion.min() < price) {
                return callPrice;
            }
        }

        return null;
    }

    @Autowired
    private void setCallPriceList(List<CallPrice> callPriceList) {
        this.callPriceList = callPriceList;
    }

}
