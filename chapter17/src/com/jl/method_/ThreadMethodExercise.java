package com.jl.method_;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {

        T2 t2 = new T2();
        Thread thread = new Thread(t2);

        for (int i = 0; i <= 10; ++i) {
            System.out.println("hi" + i);

            Thread.sleep(100);

            if (i == 5) {

                thread.start();
                thread.join();
            }
        }
    }
}

class T2 implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i <= 10; ++i) {
            System.out.println("hello" + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}