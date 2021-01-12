package com.example.demo.pattern.strategy.normal;

public class ZipCompress implements CompressStrategy {
    @Override
    public boolean compress(String source, String to) {
        return false;
    }

    @Override
    public boolean unCompress(String source, String to) {
        return false;
    }
}
