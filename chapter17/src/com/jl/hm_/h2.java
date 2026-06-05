package com.jl.hm_;

public class h2 {
    public static void main(String[] args) {

        User user = new User();

        Thread thread = new Thread(user);
        Thread thread1 = new Thread(user);
        thread.start();
        thread1.start();

    }
}
// (1)有2个用户分别从同一个卡上取钱(总额:10000)
// (2)每次都取1000，当余额不足时，就不能取款了
// (3)不能出现超取现象=》线程同步问题.

class User implements Runnable {
    private int sal = 10000;
    private boolean loop = true;

    public void withdraw() {

        synchronized (User.class) {
            if (sal < 1000) {  // 余额不足1000就不能取
                if (sal > 0) {
                    System.out.println("余额不足，当前余额：" + sal);
                }
                loop = false;
                return;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sal -= 1000;
            System.out.println("窗口:" + Thread.currentThread().getName() + "取出1000元" + "\t 余额剩余 " + sal);

        }
    }

    @Override
    public void run() {
        while (loop) {
            withdraw();

        }
    }
}