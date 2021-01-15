package com.example.demo.pattern.adaptor.object;

public class AdaptorMain {

    /*
        定义了一个接口，又要放mp4，又要放avi，以前就可以直接放MP4。所以直接把MP4桥接进来。

        老的接口只支持MP4播放。
        现在新加入的接口要直接avi的播放
        则把老的mp4播放桥接进来，只实现avi的播放


 下面总结下对象适配器的优点：
（1）适配器模式可以理解成是在原有基础上的封装，不需要对原有程序进行改动，即可实现特定功能。
（2）对象适配器可以服务于多个源角色，便于程序的扩展。
     */

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.setAdapteePlayer(new AdapteePlayerImpl());
        adapter.playMp4();
        adapter.playAvi();
    }
}
