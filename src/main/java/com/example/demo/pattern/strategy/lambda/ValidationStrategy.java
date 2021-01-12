package com.example.demo.pattern.strategy.lambda;

@FunctionalInterface
public interface ValidationStrategy {
    boolean execute(String a);
}
