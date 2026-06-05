package com.jl.tankgame4;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {


    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    int step = 30;

    public EnemyTank(int x, int y) {

        setX(x);  // 调用父类的 setX
        setY(y);  // 调用父类的 setY
    }

    @Override
    public void run() {
        while (isLive) {

            if (shots.size() < 2) {

//            创建一颗子弹放入到size集合并且启动

                Shot s = null;
                switch (getDirection()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();


            }


//        写上相应的业务代码
//        如自由移动

//            根据坦克移动方向来继续移动,


            switch (getDirection()) {
                case 0:
//                    让坦克保持一个方向走step步
                    for (int i = 0; i <= step; i++) {


                        movingUp();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;


                case 1:
                    for (int i = 0; i <= step; i++) {


                        movingRight();

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i <= step; i++) {


                        movingDown();

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i <= step; i++) {


                        movingLeft();

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            setDirection((int) (Math.random() * 4));

            if (!isLive) {
                break;
            }


//            然后随机改变方向


        }
    }
}