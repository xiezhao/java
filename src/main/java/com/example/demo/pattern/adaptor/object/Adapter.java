package com.example.demo.pattern.adaptor.object;

public class Adapter implements com.example.demo.pattern.adaptor.object.TargetPlayer1 {
    private AdapteePlayer adapteePlayer;

    public void setAdapteePlayer(AdapteePlayer adapteePlayer) {
        this.adapteePlayer = adapteePlayer;
    }

    @Override
    public void playMp4() {
        adapteePlayer.playMp4();
    }

    @Override
    public void playAvi() {
        System.out.println("play avi");
    }
}
