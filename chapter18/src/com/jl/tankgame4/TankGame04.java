package com.jl.tankgame4;



import javax.swing.*;

public class TankGame04 extends JFrame {



    MyPanel panel;
    public TankGame04() {
        panel = new MyPanel();
        new Thread(panel).start();
        this.add(panel);

        this.setSize(1000, 750);
        this.addKeyListener(panel); //让JFrame监听
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        TankGame04 tankGame01 = new TankGame04();

    }
}
