package com.example.demo;

import com.example.demo.pattern.chain.HandlerRequest;
import com.example.demo.pattern.chain.MainHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChainTest {

    @Autowired
    private MainHandler mainHandler;

    @Test
    public void test(){
        HandlerRequest handlerRequest = new HandlerRequest();
        handlerRequest.setName("rick");
        mainHandler.handler(handlerRequest);
    }
}
