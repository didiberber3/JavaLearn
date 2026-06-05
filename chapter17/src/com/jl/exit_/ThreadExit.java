package com.jl.exit_;

public class ThreadExit  {
    public static void main(String[] args) throws InterruptedException {


        T t = new T();
        t.start();

        System.out.println("主线程休眠10s....");
        Thread.sleep(10*1000);
//        如果希望主线程T1线程的终止,需要能够修改loop的set
        t.setLoop(false);
    }
}

class T extends Thread {
    int count = 0;
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            count++;
            System.out.println("T运行中......" + count);

        }
    }
}