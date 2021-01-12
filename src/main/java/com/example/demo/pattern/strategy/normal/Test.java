package com.example.demo.pattern.strategy.normal;

public class Test {

    public static void main(String[] args) {
//        CompressContext compressContext = new CompressContext(new GzipCompress());
//        compressContext.compress("", "");
//        compressContext.unCompress("", "");


        CompressStrategy compress = CompressFactory.getInstance().getCompress(CompressTypeEnum.GZIP);
        compress.compress("", "");
        compress.unCompress("", "");


        CompressStrategy gzip = CompressTypeEnum.getCompressByType("GZIP");
        gzip.compress("", "");
        gzip.unCompress("", "");


    }
}
