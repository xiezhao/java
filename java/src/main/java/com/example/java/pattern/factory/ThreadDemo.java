package com.example.java.pattern.factory;

public class ThreadDemo {

    /**
     * 子线程循环2次，主线程循环10次，然后子线程循环2次，主线程循环100次，这样循环5次
     */


    /*
        主线程就用main，子线程新创建一个进程
     */

    public static class SubRun implements Runnable {

        private Integer count = 0;

        @Override
        public void run() {

            while (true) {
                synchronized (this) {
                    for (int i = 0; i < 2; i++) {
                        System.out.println(Thread.currentThread().getName() + " - " + i);
                    }
                    try {
                        this.notifyAll();
                        this.wait(); //1.释放cpu 2.释放锁 3.唤醒等待锁的进程（不会唤醒因为wait而阻塞的进程）
                        //子线程wait在这里，等待主线程也循环完10次，notifyall醒自己的wait，然后计时器加1，当加到5的时候，唤醒主线程，然后自己break掉
                        count++;
                        if (count >= 5) {
                            this.notifyAll();
                            break;
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        SubRun subRun = new SubRun();
        Thread thread = new Thread(subRun);
        thread.start();


        while (true) {
            synchronized (subRun) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                }
                try {
                    subRun.notifyAll();
                    subRun.wait();
                    if (subRun.count >= 5) {
                        break;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
