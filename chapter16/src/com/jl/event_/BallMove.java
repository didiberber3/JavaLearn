package com.jl.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class BallMove extends JFrame {


    MyPanel panel;


    public BallMove() {
        panel = new MyPanel();
        this.add(panel);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(panel);
    }

    public static void main(String[] args) {

        BallMove ballMove = new BallMove();
    }
}

class MyPanel extends JPanel implements KeyListener {


    //    为了让小球可以移动，将左上角x坐标设置成变量
    int x = 10;
    int y = 10;
    int speed = 5;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);//黑色

    }

    //有字符输出
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode()+"被按下......");


//        根据按下不同键，来处理小球的移动
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {     //VK_UP 向上箭头

            y += speed;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {     //VK_UP 向上箭头

            y -= speed;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {     //VK_UP 向上箭头

            x -= speed;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {     //VK_UP 向上箭头

            x += speed;
        }
        this.repaint();


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}