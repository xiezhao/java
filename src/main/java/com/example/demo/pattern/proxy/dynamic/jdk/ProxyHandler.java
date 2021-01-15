package com.example.demo.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*

    动态代理中，代理类及其实例是程序自动生成的，因为我们不需要手动去创建代理类，
    JDK中，InvocationHandler(Interface)接口 和 Proxy(class) 类是我们实现动态代理所必须用到的。
    Proxy通过使用 InvocationHandler对象生成具体的代理对象。

 */
public class ProxyHandler implements InvocationHandler {

    private Object proxied; //被代理的对象

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }


    /*

    事实上，Proxy 动态产生的代理对象调用目标方法时，
    代理对象会调用 InvocationHandler 实现类，
    所以 InvocationHandler 是实际执行者。

     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //增强
        System.out.println("打印日志，增强前...");

        Object invoke = method.invoke(proxied, args);

        //增强
        System.out.println("打印日志，增强后...");

        return invoke;
    }
}
