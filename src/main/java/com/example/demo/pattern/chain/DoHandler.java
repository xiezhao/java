package com.example.demo.pattern.chain;

public interface DoHandler {

    void handler(HandlerRequest handlerRequest);

    void setHandler(DoHandler doHandler);

    DoHandler getHandler();

}
