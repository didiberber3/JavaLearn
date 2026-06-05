package com.jl.threaduse;

public class Thread02 {
    public static void main(String[] args) {

        Dog dog = new Dog();
//        dog.start();
        Thread thread = new Thread(dog);    //  代理模式or静态代理
        thread.start();

    }
}

//Proxy 代理
//线程代理
class ThreadProxy implements Runnable {

    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
    public ThreadProxy(Runnable target) {
    this.target = target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}


class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪" + (++count) + Thread.currentThread().getName());
            if (count == 10) {
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}