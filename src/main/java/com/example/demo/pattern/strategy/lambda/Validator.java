package com.example.demo.pattern.strategy.lambda;

/**
 * Context 对象
 */
public class Validator {

    private final ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String a) {
        return validationStrategy.execute(a);
    }
}
