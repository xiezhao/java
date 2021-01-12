package com.example.demo.pattern.责任链;

public interface DoHandler {

    void handler(HandlerRequest handlerRequest);

    void setHandler(DoHandler doHandler);

    DoHandler getHandler();

}
