package com.example.demo.pattern.strategy.lambda;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator((String a) -> a.matches("1"));
        validator.validate("");
    }
}
