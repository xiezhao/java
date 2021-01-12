package com.example.demo.pattern.strategy.normal;


/**
 * 把Enum写入到数据库中，然后拿到配置的enum得到CompressStrategy再执行具体方法就可以了，这个是做配置，否则你就要知道逻辑写在factory中。
 * 或者不要factory的话，直接客户端自己去选
 */
public enum CompressTypeEnum {

    GZIP {
        @Override
        public CompressStrategy getCompress() {
            return new GzipCompress();
        }
    },

    ZIP {
        @Override
        public CompressStrategy getCompress() {
            return new ZipCompress();
        }
    };

    public abstract CompressStrategy getCompress();

    public static CompressStrategy getCompressByType(String type){
        CompressTypeEnum[] values = CompressTypeEnum.values();
        for (CompressTypeEnum value : values) {
            if (value.name().equals(type)) {
                return value.getCompress();
            }
        }

        return null;
    }
}
