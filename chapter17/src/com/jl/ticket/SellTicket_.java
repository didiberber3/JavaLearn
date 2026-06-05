package com.jl.ticket;

//三个窗口同时售票100张
public class SellTicket_ {
    public static void main(String[] args) {

//
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket02 sellTicket1 = new SellTicket02();
        SellTicket02 sellTicket2 = new SellTicket02();
        SellTicket02 sellTicket3 = new SellTicket02();
        Thread t1 = new Thread(sellTicket1);
        Thread t2 = new Thread(sellTicket2);
        Thread t3 = new Thread(sellTicket3);
        t1.start();
        t2.start();
        t3.start();

    }
}

//使用继承Thread方式
class SellTicket01 extends Thread {


    private static int ticketNum = 100;

    //    让多个线程共享num
    @Override
    public synchronized void run() {

        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票卖完了");
                break;

            }
//            休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口:" + Thread.currentThread().getName() + "售出一张票" + "\t 剩余 " + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {


    private static int ticketNum = 100;

    //    让多个线程共享num
    @Override
    public void run() {

        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票卖完了");
                break;

            }
//            休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口:" + Thread.currentThread().getName() + "售出一张票" + "\t 剩余 " + (--ticketNum));
        }
    }
}