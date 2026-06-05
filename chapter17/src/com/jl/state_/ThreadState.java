package com.jl.state_;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {

        T t = new T();
        Thread t1 = new Thread(t);
        System.out.println(t1.getName() + " 状态 " + t1.getState());
        t1.start();

        while (Thread.State.TERMINATED != t1.getState()) {
            System.out.println(t1.getName() + " 状态 " + t1.getState());

            Thread.sleep(500);
        }
        System.out.println(t1.getName() + " 状态 " + t1.getState());

    }
}

class T implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; ++i) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}