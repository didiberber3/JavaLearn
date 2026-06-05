package com.jl.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //    定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形 默认黑色

        drawTank(hero.getX(), hero.getY(), g, 0, 1);
        drawTank(hero.getX() + 50, hero.getY() + 50, g, 0, 0);


    }


    /**
     * @param x         坦克左上角x坐标
     * @param y         坦克左上角y坐标
     * @param g         画笔
     * @param direction 坦克方向 上下左右
     * @param type      坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        //根据不同的坦克类型，设置不同的颜色
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;

        }

//       根据坦克的方向绘制坦克
        switch (direction) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false); //左边履带
                g.fill3DRect(x + 30, y, 10, 60, false); //右边履带
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //驾驶舱
                g.fillOval(x + 10, y + 20, 20, 20); //盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒
            default:
                System.out.println("暂时不处理");

        }
    }
}
