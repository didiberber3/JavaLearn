package com.jl.method_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
//        如果我们希望当主线程结束后 子线程自动结束
//        只需要将子线程设置为守护线程即可
        MydaemonThread mydaemonThread = new MydaemonThread();
        mydaemonThread.setDaemon(true);
        mydaemonThread.start();


        for (int i = 1; i <=10 ; i++) {
            System.out.println("宝强辛苦的工作");
            Thread.sleep(1000);
        }
    }
}

class MydaemonThread extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("马蓉和宋喆在聊天,哈哈哈哈~~");
        }
    }
}
