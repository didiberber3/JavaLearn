package com.jl.tankgame2;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;


public class MyPanel extends JPanel implements KeyListener {
    //    定义我的坦克
    Hero hero = null;
    //    定义敌人坦克
    EnemyTank et1 = null;
    EnemyTank et2 = null;
    EnemyTank et3 = null;

    Vector<EnemyTank> enemyTanks = new Vector();
    int enemyTanksSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(10);

//        初始化敌人的坦克
        for (int i = 0; i < enemyTanksSize; i++) {
//            创建敌人坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
//            设置敌人坦克方向
            enemyTank.setDirection(2);
//            向敌人坦克数组中添加敌人坦克
            enemyTanks.add(enemyTank);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形 默认黑色
        //画出自己的坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 1);
//画出敌人的坦克
//        drawTank(hero.getX() + 50, hero.getY() + 50, g, 0, 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 0);
        }


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
                g.setColor(Color.yellow);
                break;
            case 1:
                g.setColor(Color.cyan);
                break;

        }

//       根据坦克的方向绘制坦克
        //direction表示不同方向，0向上，1向右，2向下，3向左
        switch (direction) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false); //左边履带
                g.fill3DRect(x + 30, y, 10, 60, false); //右边履带
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //驾驶舱
                g.fillOval(x + 10, y + 20, 20, 20); //盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒
                break;
            case 1: //向右
                g.fill3DRect(x, y, 60, 10, false); //上边履带
                g.fill3DRect(x, y + 30, 60, 10, false); //下边履带
                g.fill3DRect(x + 10, y + 10, 40, 20, false); //驾驶舱
                g.fillOval(x + 20, y + 10, 20, 20); //盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//炮筒
                break;
            case 2: //向下
                g.fill3DRect(x, y, 10, 60, false); //左边履带
                g.fill3DRect(x + 30, y, 10, 60, false); //右边履带
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //驾驶舱
                g.fillOval(x + 10, y + 20, 20, 20); //盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//炮筒
                break;
            case 3: //向左
                g.fill3DRect(x, y, 60, 10, false); //上边履带
                g.fill3DRect(x, y + 30, 60, 10, false); //下边履带
                g.fill3DRect(x + 10, y + 10, 40, 20, false); //驾驶舱
                g.fillOval(x + 20, y + 10, 20, 20); //盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//炮筒
                break;
            default:
                System.out.println("暂时不处理");

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override//WASD按下 改变direction
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirection(0);
            hero.movingUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirection(1);
            hero.movingRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirection(2);
            hero.movingDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirection(3);
            hero.movingLeft();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
