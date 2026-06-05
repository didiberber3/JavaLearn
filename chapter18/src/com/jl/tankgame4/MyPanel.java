package com.jl.tankgame4;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了让Panel 不停的重绘,需要将MyPanel实现Runnable接口,作为一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //    定义我的坦克
    Hero hero;

    Vector<EnemyTank> enemyTanks = new Vector<>();

    //    当子弹击中坦克时,加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector<>();

    int enemyTanksSize = 3;

    Image image1;
    Image image2;
    Image image3;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(10);


//        初始化敌人的坦克
        for (int i = 0; i < enemyTanksSize; i++) {
//            创建敌人坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
//            设置敌人坦克方向
            enemyTank.setDirection(2);

//            启动敌人坦克线程
            Thread thread1 = new Thread(enemyTank);
            thread1.start();

////            给该EnemyTank添加一颗子弹
//            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
////            加入enemyTank的Vector的成员
//            enemyTank.shots.add(shot);
////            启动shot对象
//            Thread thread = new Thread(shot);
//            thread.start();


//            向敌人坦克数组中添加敌人坦克
            enemyTanks.add(enemyTank);


        }
//        初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/explosion1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/explosion2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/explosion3.png"));

    }

    //    判断地方坦克是否击中我方坦克
    public void hitHero() {
        for (int i = 0; i < enemyTanks.size(); i++) {

            EnemyTank et = enemyTanks.get(i);

//            遍历
            for (int j = 0; j < et.shots.size(); j++) {
//                取出子弹
                Shot shot = et.shots.get(j);
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);


                }
            }
        }
    }

    //    什么时候判断我方的子弹是否击中地方坦克
    public void hitTank(Shot s, Tank enemyTank) {
//        判断 s  击中enemyTank
        switch (enemyTank.getDirection()) {
            case 0:

            case 2: //坦克左右方向命中
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {

                    s.isLive = false;
                    enemyTank.isLive = false;
//                    创建一个Bomb对象加入到bombs
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:

            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                    break;
                }
        }

        for (int i = 0; i < hero.shots.size(); i++) {

            if (hero.shots.get(i) != null && hero.shots.get(i).isLive) {
//                遍历敌人所有的坦克
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank e = enemyTanks.get(j);

                    hitTank(hero.shots.get(i), e);

                }

            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形 默认黑色
        //画出自己的坦克
        if (hero != null && hero.isLive) {

            drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 1);
        }


//        画出敌人的坦克
//        drawTank(hero.getX() + 50, hero.getY() + 50, g, 0, 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

//            判断当前tank是否存活
            if (enemyTank.isLive) { //当敌人坦克是存活的才画出该坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 0);

                for (int j = 0; j < enemyTank.shots.size(); j++) {
//                取出子弹准备绘制
                    Shot shot = enemyTank.shots.get(j);
//                绘制
                    if (shot.isLive) { //isLive ==true
                        g.fillOval(shot.x, shot.y, 10, 10);

                    } else {
                        enemyTank.shots.remove(shot);
                        j--;
                    }
                }
            } else {
                enemyTanks.remove(enemyTank);
                System.out.println("敌方坦克已被消灭");

            }


        }

        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);

//        画出hero射击的子弹
            if (shot != null && shot.isLive) {
                g.fillOval(shot.x, shot.y, 10, 10);

            } else {
                hero.shots.remove(shot);
            }

        }

//          如果bombs中有炸弹,画出炸弹
        for (int i = 0; i < bombs.size(); i++) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Bomb bomb = bombs.get(i);

            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);

            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);

            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);

            }
            bomb.lifeDown();
//            如果Bomb life为0,就从bombs的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);

            }
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

//        如果用户按下的是J,就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            if (hero.isLive) {

//            创建一个新的子弹线程
                hero.shotBullet();
            }

        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {

        while (true) {


            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            判断shot是否击中enemyTank

//            当前我的子弹还存活
//            if (hero.shot != null && hero.shot.isLive) {
////                遍历敌人所有的坦克
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//
//                    hitTank(hero.shot, enemyTank);
//
//                }
//            }


//            判断敌人坦克是否击中我方坦克
            hitHero();


            this.repaint();

        }
    }
}
