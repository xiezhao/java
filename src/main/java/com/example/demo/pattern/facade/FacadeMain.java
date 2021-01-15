package com.example.demo.pattern.facade;

import com.example.demo.pattern.facade.facade.Computer;

public class FacadeMain {

    /*

        facade 就是搞一个类把子功能都包起来，暴露给外面很少的信息

     */
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }
}
