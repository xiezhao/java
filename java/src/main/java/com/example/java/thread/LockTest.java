package com.example.java.thread;

public class LockTest {

    /*
        死锁：线程占有一把锁，还想要另外一把锁，必须有2个锁
     */




    static class R1 implements Runnable {
        private Object object1, object2;

        public R1(Object object1, Object object2) {
            this.object1 = object1;
            this.object2 = object2;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (object1) {
                    synchronized (object2) {
                        //当一定几率两个锁都拿到的情况下，不会死锁，但是时间放长，最会死锁的
                        System.out.println(1);
                        System.out.println(2);
                        System.out.println(3);
                    }
                }
            }
        }
    }


    static class R2 implements Runnable {
        private Object object1, object2;

        public R2(Object object1, Object object2) {
            this.object1 = object1;
            this.object2 = object2;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (object2) {
                    synchronized (object1) {
                        System.out.println("A");
                        System.out.println("B");
                        System.out.println("C");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Object o = new Object();
        Object o2 = new Object();

        Thread thread = new Thread(new R1(o, o2));
        Thread thread2 = new Thread(new R2(o, o2));

        thread.start();
        thread2.start();
    }


}
