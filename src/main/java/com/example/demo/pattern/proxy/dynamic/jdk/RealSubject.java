package com.example.demo.pattern.proxy.dynamic.jdk;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("RealSubject doSomething");
    }
}
