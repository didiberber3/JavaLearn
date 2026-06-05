package com.jl.threaduse;

public class Thread03 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        Thread thread = new Thread(a);
        Thread thread1 = new Thread(b);
        thread.start();
        thread1.start();


    }
}

class A implements Runnable{
    int count;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world");
            ++count;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 10) {
                break;
            }
        }
    }
}

class B implements Runnable {
    int count;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi");
            ++count;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 5) {
                break;
            }
        }
    }
}
