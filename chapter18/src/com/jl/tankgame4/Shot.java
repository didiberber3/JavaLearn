package com.jl.tankgame4;

public class Shot implements Runnable {

    int x;
    int y;
    int direction;
    int speed = 10;

    boolean isLive = true;

    //    当前设计对应的子弹坐标
    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        while (true) {
//            子弹休眠50ms

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            根据方向来改变x,y坐标
            switch (direction) {
                case 0:
//                    向上
                    y -= speed;
                    break;
                case 1:
//                    向右
                    x += speed;
                    break;
                case 2:
//                    向下
                    y += speed;
                    break;
                case 3:
//                    向左
                    x -= speed;
                    break;


            }
//            这里输出一下x和y的坐标
            System.out.println("x=" + x + " y=" + y);


//            当子弹移动到面板的边界时（或击中时），
//            就应该销毁（销毁子弹的进程）
//            判断

//            子弹已经碰到边界
//            当子弹碰到敌人时,也应该结束线程


            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {

                isLive = false;
                System.out.println("子弹销毁");
                break;
            }
        }
    }
}
