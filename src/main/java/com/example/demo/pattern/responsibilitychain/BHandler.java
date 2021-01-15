package com.example.demo.pattern.responsibilitychain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("bHandler")
public class BHandler implements DoHandler {

    private DoHandler doHandler;

    @Override
    public void handler(HandlerRequest handlerRequest) {
        System.out.println("我是BHandler，处理name=" + handlerRequest.getName());
        getHandler().handler(handlerRequest);
    }

    @Autowired
    @Qualifier("cHandler")
    @Override
    public void setHandler(DoHandler doHandler) {
        this.doHandler = doHandler;
    }

    @Override
    public DoHandler getHandler() {
        return doHandler;
    }
}
