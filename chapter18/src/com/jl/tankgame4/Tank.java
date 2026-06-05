package com.jl.tankgame4;

public class Tank {
    boolean isLive = true;
    private int speed = 5;
    private int x;
    private int y;
    private int direction; //不默认赋值就是0

    //    上右下左移动
    public void movingUp() {
        if (y >= 0 + 10) {
            y -= speed;
        }
    }

    public void movingDown() {
        if (y <= 750 - 70) {
            y += speed;
        }
    }

    public void movingLeft() {
        if (x >= 0 + 10) {
            x -= speed;
        }
    }

    public void movingRight() {
        if (x <= 1000 - 70) {
            x += speed;
        }

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

    public void box(){
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
    }
}
