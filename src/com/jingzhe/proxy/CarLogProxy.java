package com.jingzhe.proxy;

/**
 * @author 惊蛰
 * @date 2020/11/10 20:43
 */
public class CarLogProxy implements Movable {
    Movable movable;

    public CarLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start run...");
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}
