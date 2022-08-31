package com.example.java.thread;

/**
 *  一个线程打印 1-52，另一个线程打印 A - Z，让两个线程最终打印 12A34B..5152Z
 */
public class ThreadSync {

    public static class LockClass {
        private Integer mark = 1; //这个1是用来保证让数字先输出
    }



    public static class Thead1 implements Runnable {

        private LockClass lockClass;

        public Thead1(LockClass lockClass) {
            this.lockClass = lockClass;
        }

        @Override
        public void run() {
            synchronized (lockClass) {
                for (int i = 1; i <= 52; i++) {
                    //用 while ，if判断会假的唤醒
                    while (lockClass.mark != 1) {
                        try {
                            lockClass.notifyAll();
                            lockClass.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(i);
                    if (i % 2 == 0) {
                        lockClass.mark = 2;
                    }
                }
            }
        }
    }


    public static class Thead2 implements Runnable {

        private LockClass lockClass;

        public Thead2(LockClass lockClass) {
            this.lockClass = lockClass;
        }

        @Override
        public void run() {
            synchronized (lockClass) {
                for (int i = 'A'; i < 'Z'; i++) {
                    while (lockClass.mark != 2) {
                        try {
                            lockClass.notifyAll();
                            lockClass.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println((char) i);
                    lockClass.mark = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        LockClass lockClass = new LockClass();



        Thead1 thead1 = new Thead1(lockClass);
        Thead2 thead2 = new Thead2(lockClass);


        new Thread(thead1).start();
        new Thread(thead2).start();

    }



}
