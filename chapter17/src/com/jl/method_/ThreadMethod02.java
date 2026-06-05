package com.jl.method_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;

        T1 t1 = new T1();
        t1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("hi" + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            if (i==5){
                //线程插队
//                t1.join();

                // 礼让 不一定成功
                Thread.yield();
            }
        }

    }
}

class T1 extends Thread {
    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {


            System.out.println("hello" + count++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
