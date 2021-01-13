package com.example.demo.pattern.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MainHandler implements DoHandler {

    private DoHandler doHandler;

    @Override
    public void handler(HandlerRequest handlerRequest) {
        System.out.println("开始接进请求");
        getHandler().handler(handlerRequest);
    }

    @Autowired
    @Qualifier("aHandler")
    @Override
    public void setHandler(DoHandler doHandler) {
        this.doHandler = doHandler;
    }

    @Override
    public DoHandler getHandler() {
        return doHandler;
    }
}
