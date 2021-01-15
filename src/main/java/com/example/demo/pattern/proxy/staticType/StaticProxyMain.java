package com.example.demo.pattern.proxy.staticType;

public class StaticProxyMain {

    /*

         StaticProxyMovie 在没有修改 RealMovie 类的情况下，扩展了该对象的方法功能
     */

    public static void main(String[] args) {
        StaticProxyMovie staticProxyMovie = new StaticProxyMovie(new RealMovie());
        staticProxyMovie.watch("hua mu lan");
    }
}
