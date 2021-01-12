package com.example.demo.pattern.strategy.normal;

public class CompressFactory {

    private static final CompressFactory compressFactory = new CompressFactory();

    public CompressStrategy getCompress(CompressTypeEnum compressTypeEnum) {
        return compressTypeEnum.getCompress();
    }

    public static CompressFactory getInstance(){
        return compressFactory;
    }

}
