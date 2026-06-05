package com.jl.tankgame3;

public class Hero extends Tank {

    Shot shot = null; //表示一个射击行为,本质线程

    public Hero(int x, int y) {
        setX(x);  // 调用父类的 setX
        setY(y);  // 调用父类的 setY
    }

    //    射击
    public void shotBullet() {
//        创建 Shot对象:根据当前Hero对象的位置和方向,创建子弹
        switch (getDirection()) {//得到Hero对象的方向
            case 0: //上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //左
                shot = new Shot(getX(), getY() + 20, getDirection());
        }
//        启动shot线程
        new Thread(shot).start();


    }

}