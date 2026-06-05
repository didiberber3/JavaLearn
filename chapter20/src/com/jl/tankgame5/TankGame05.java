package com.jl.tankgame5;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGame05 extends JFrame {



    MyPanel panel;

    static Scanner scanner = new Scanner(System.in);

    public TankGame05() {
        System.out.println("请输入选择: 1.新游戏\t2.继续游戏");
        String key =  scanner.next();
        panel = new MyPanel(key);
        new Thread(panel).start();
        this.add(panel);

        this.setSize(1600, 1200);
        this.addKeyListener(panel); //让JFrame监听
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


//        在Jframe中，增加 响应 关闭窗口 的 处理
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("监听到关闭窗口了。。。");
                Recorder.saveRecord();
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {



        TankGame05 tankGame01 = new TankGame05();

    }
}

