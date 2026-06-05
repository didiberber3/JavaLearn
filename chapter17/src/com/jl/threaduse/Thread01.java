package com.jl.threaduse;

public class Thread01 {
    //    在主线程中开启main线程
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();
        //启动线程
        cat.start();
//        当main线程启动了一个子线程 Thread0 主线程不会阻塞,继续执行.
//      cat.run(); 此为调用方法,不会启动子线程,会等待run完成后,才会执行主线程中的内容.

        //  public synchronized void start() {
        //      start0();
        //  }
//        2. start0()是本地方法,是JVM调用,底层是C/C++实现的
        System.out.println("主线程执行中:" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程在执行中i=" + i);
//            让主线程休眠
            Thread.sleep(1000);
        }

    }
}

//说明:
//1. 当一个类继承了Thread类,该类就是一个线程
//2. 通常会重写run方法,写上自己的业务代码
//3. run Thread类 实现了 Runnable 接口的run方法
/*
@Override
    public void run() {
        if (target != null){
        target.run();
    }
}
*/
class Cat extends Thread {
    int times = 0;

    @Override
    public void run() {
        while (true) {

            System.out.println("喵喵我是小猫咪" + (++times) + ";线程名=" + Thread.currentThread().getName());
//        让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }
    }
}