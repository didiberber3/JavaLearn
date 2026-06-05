package com.jl.tankgame3;

import java.util.Vector;

public class EnemyTank extends Tank {

    Vector<Shot> shots = new Vector<>();

    public EnemyTank(int x, int y) {

        setX(x);  // 调用父类的 setX
        setY(y);  // 调用父类的 setY
    }


}