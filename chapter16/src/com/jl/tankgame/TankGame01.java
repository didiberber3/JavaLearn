package com.jl.tankgame;

import javax.swing.*;

public class TankGame01 extends JFrame {

    MyPanel panel;

    public TankGame01() {
        panel = new MyPanel();
        this.add(panel);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        TankGame01 tankGame01 = new TankGame01();

    }
}
