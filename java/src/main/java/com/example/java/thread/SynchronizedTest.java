package com.example.java.thread;

public class SynchronizedTest {

    /*
       1. 一个线程占有了一个对象的锁以后，cpu资源仍然能被其他线程抢走
       2. 当其他线程抢走cpu后，发现获取不到对象锁，则此线程会进入阻塞状态，并且进入由于获取不到锁而阻塞的阻塞队列中。
       3. 当占有锁的线程，释放锁的时候，就会立即唤醒等待对象锁的其他线程。（都在阻塞队列中）

        上面所说的释放锁的时候，包括了所有释放锁的情况
        1、 线程退出同步块
       synchronized (obj) {  //线程进入同步块时，会尝试获取锁

        }  //线程退出同步块时，会释放占有的对象锁，且唤醒其他等待锁的线程（都在阻塞队列中）

        2. 线程调用了wait方法时，会释放cpu，释放锁，因为wait也会引起锁的释放，而一旦释放锁，也就会立即唤醒那些等待锁的线程。


        线程阻塞的原因：
            1. 获取锁得不到，进入，等待锁的阻塞队列。
                只有占有锁的线程，释放锁时，才会唤醒这个队列中的线程。
                notify不会唤醒该队列中的线程。

            2. 正在占有锁的线程，调用了wait，就进去了wait阻塞队列
                只有obj.notify()方法，才会唤醒这个队列中的线程
                一般都释放锁，无法唤醒该队列中的线程

            3. 正在执行中的线程，调用了 sleep()或者IO，就进入了 另一个阻塞队列
                失眠时间到，或者IO阻塞结束，线程才得以继续进入可运行状态

            就绪队列。

            一个4个队列。

     */

    public static void main(String[] args) {
        String a = "";

        synchronized (a) {

        }


    }


}
