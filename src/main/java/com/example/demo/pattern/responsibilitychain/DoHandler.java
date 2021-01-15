package com.example.demo.pattern.responsibilitychain;

public interface DoHandler {

    void handler(HandlerRequest handlerRequest);

    void setHandler(DoHandler doHandler);

    DoHandler getHandler();

}
