package com.jl.hm_;

import javax.swing.*;
import java.util.Scanner;

public class h1 extends JFrame {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();


    }
}

class T1 implements Runnable {


    boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        while (flag) {
            System.out.println((int) (Math.random() * 100 + 1));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T2 implements Runnable {
    private T1 t1;

    private Scanner scanner = new Scanner(System.in);

    public  T2(T1 t1) {//构造器中直接传入一个T1对象
        this.t1 = t1;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println("请输入你的指令(Quit：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
//                以通知的方式结束T1线程
                t1.setFlag(false);
                System.out.println("T2线程退出");
                break;
            }
        }

    }


}