package com.example.demo.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class JdkProxyMain {

    /*


        代理对象proxySubject所对应的类继承自java.lang.reflect.Proxy类，
        这也正是JDK动态代理机制无法实现对class的动态代理的原因：Java只允许单继承

        因为生成的代理对象proxySubject要继承 java.lang.reflect.Proxy类，所以就没有办法
        再继承别的类了，例如要增强 RealSubject 可以继承他，但是java只能是单继承，所以需要用到接口做代理。

     */
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new ProxyHandler(realSubject));

        proxySubject.doSomething();

        System.out.println("代理对象的类型 ： " + proxySubject.getClass().getName());
        System.out.println("代理对象所在类的父类型 ： " + proxySubject.getClass().getGenericSuperclass());
    }
}
