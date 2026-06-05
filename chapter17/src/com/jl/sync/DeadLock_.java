package com.jl.sync;

public class DeadLock_ {
    public static void main(String[] args) {

//        模拟一个死锁现象
        DeadLock_Thread A = new DeadLock_Thread(true);
        DeadLock_Thread B = new DeadLock_Thread(false);

        A.start();
        A.setName("A线程");
        B.start();
        B.setName("B线程");


    }
}

class DeadLock_Thread extends Thread {
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    boolean flag;

    public DeadLock_Thread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
//        业务逻辑分析

//        1. 如果flag为T,线程A就会先得到o1 对象锁 然后尝试去获取o2对象锁
//        2. 如果线程A得不到o2对象锁,就会Blocked

//        3. 如果flag为false ,线程B 就会先得到o2 对象锁,然后尝试去获取o1对象锁
//        4. 如果线程B得不到o1对象锁,就会Blocked
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " 进入2");

                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " 进入4");

                }
            }
        }
    }
}