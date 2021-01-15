package com.example.demo.pattern.responsibilitychain;

import org.springframework.stereotype.Service;

@Service("cHandler")
public class CHandler implements DoHandler {

    private DoHandler doHandler;

    @Override
    public void handler(HandlerRequest handlerRequest) {
        System.out.println("我是CHandler，处理name=" + handlerRequest.getName());
    }


    @Override
    public void setHandler(DoHandler doHandler) {
        this.doHandler = doHandler;
    }

    @Override
    public DoHandler getHandler() {
        return doHandler;
    }
}
