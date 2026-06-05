package com.jl.draw_;

import javax.swing.*;
import java.awt.*;

//Frame 框架
//Graphics 图形
//Panel 面板

public class DrawCircle extends JFrame {
    //    定义一个面板
    private MyPanel mp = null;

    public DrawCircle() {//构造器做完
//        初始化面板
        mp = new MyPanel();
//        把面板放入到窗口
        this.add(mp);
//        设置一下窗口大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public static void main(String[] args) {

        new DrawCircle();
        System.out.println("退出程序");
    }

}
// 1. 先定义一个MyPanel,继承Jpanel类，画图形就在这个面板上画

// panel 面板
class MyPanel extends JPanel {

    //	Graphics g
//	1. MyPanel 对象就是一个画板
//	2.
    @Override
    public void paint(Graphics g) { //graphics 图案
        super.paint(g); //调用父类的方法完成初始化

//        g.drawOval(0, 0, 100, 100);

//        g.drawLine(10, 10, 100, 100);
//        g.drawRect(10, 10, 100, 100);
//
//        g.setColor(Color.GREEN);
//        g.fillRect(10, 10, 100, 100);
//
//        g.setColor(Color.RED);
//        g.fillOval(10, 10, 100, 100);

        Image img = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/background.jpg"));
        g.drawImage(img, 1072, 1016, this);

        g.setColor(Color.GREEN);
        g.setFont(new Font("宋体", Font.BOLD, 50));
        g.drawString("牛逼clus", 100, 100);

    }
}