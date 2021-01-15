package com.example.demo.pattern.adaptor.object;

public class Adapter1 extends com.example.demo.pattern.adaptor.object.AdapteePlayerImpl1
        implements com.example.demo.pattern.adaptor.object.TargetPlayer1 {

    public void playMp4() {
        super.playMp4();
    }

    @Override
    public void playAvi() {
        System.out.println("play avi");
    }
}
