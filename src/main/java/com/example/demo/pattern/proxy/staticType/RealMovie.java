package com.example.demo.pattern.proxy.staticType;

public class RealMovie implements Movie {
    @Override
    public void watch(String name) {
        System.out.println("i'm watching " + name);
    }
}
