package com.example.demo.pattern.strategy.normal;

public class CompressContext {

    private CompressStrategy compressStrategy;

    public CompressContext(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public boolean compress(String source, String to) {
        return compressStrategy.compress(source, to);
    }

    public boolean unCompress(String source, String to) {
        return compressStrategy.unCompress(source, to);
    }
}
