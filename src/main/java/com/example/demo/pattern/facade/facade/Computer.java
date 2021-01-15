package com.example.demo.pattern.facade.facade;

import com.example.demo.pattern.facade.CPU;
import com.example.demo.pattern.facade.Disk;

public class Computer {

    private CPU cpu = new CPU();
    private Disk disk = new Disk();

    public void start(){
        cpu.start();
        disk.start();
    }

    public void shutdown(){
        cpu.shutdown();
        disk.shutdown();
    }

}
