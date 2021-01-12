package com.example.demo.pattern.责任链;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("aHandler")
public class AHandler implements DoHandler {

    private DoHandler doHandler;

    @Override
    public void handler(HandlerRequest handlerRequest) {
        System.out.println("我是AHandler，处理name=" + handlerRequest.getName());
        getHandler().handler(handlerRequest);
    }


    @Autowired
    @Qualifier("bHandler")
    @Override
    public void setHandler(DoHandler doHandler) {
        this.doHandler = doHandler;
    }

    @Override
    public DoHandler getHandler() {
        return doHandler;
    }
}
