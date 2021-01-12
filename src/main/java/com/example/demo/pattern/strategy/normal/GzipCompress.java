package com.example.demo.pattern.strategy.normal;

public class GzipCompress implements CompressStrategy {
    @Override
    public boolean compress(String source, String to) {
        System.out.println("GzipCompress compress");
        return false;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println("GzipCompress unCompress");
        return false;
    }
}
