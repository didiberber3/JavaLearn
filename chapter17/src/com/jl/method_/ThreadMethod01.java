package com.jl.method_;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {


        T t = new T();
        t.setName("小琪");
        t.setPriority(Thread.MIN_PRIORITY);//最小优先级
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("hi"+i);
            Thread.sleep(1000);
        }

        System.out.println(t.getName()+"线程的优先级为:"+t.getPriority());

        t.interrupt();//执行到这里就会中断进行的休眠


    }
}

class T extends Thread {
    @Override
    public void run() {
       while (true) {
           for (int i = 0; i < 100; i++) {
               System.out.println(Thread.currentThread().getName() + "吃包子" + i);

           }
               try {
                   Thread.sleep(20000); //20s
               } catch (InterruptedException e) {
                   System.out.println(Thread.currentThread().getName() + "被interrupt了");

               }
       }
    }
}