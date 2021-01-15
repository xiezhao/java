package com.example.demo.pattern.adaptor.object;

public class AdaptorMain1 {

    /*
        这种是继承类的，对于适配器要创建一个接口，因为java不支持多继承
     */

    public static void main(String[] args) {
        com.example.demo.pattern.adaptor.object.Adapter1 adapter = new com.example.demo.pattern.adaptor.object.Adapter1();
        adapter.playMp4();
        adapter.playAvi();
    }
}
