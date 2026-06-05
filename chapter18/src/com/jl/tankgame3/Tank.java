package com.jl.tankgame3;

public class Tank {
    private int speed = 5;
    private int x;
    private int y;
    private int direction; //不默认赋值就是0

    //    上右下左移动
    public void movingUp() {
        y -= speed;
    }

    public void movingDown() {
        y += speed;
    }

    public void movingLeft() {
        x -= speed;
    }

    public void movingRight() {
        x += speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
