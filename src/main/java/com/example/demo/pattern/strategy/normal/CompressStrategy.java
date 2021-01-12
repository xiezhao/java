package com.example.demo.pattern.strategy.normal;

public interface CompressStrategy {

    boolean compress(String source, String to);
    boolean unCompress(String source, String to);
}
