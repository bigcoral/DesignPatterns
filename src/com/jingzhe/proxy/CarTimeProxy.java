package com.jingzhe.proxy;

/**
 * @author 惊蛰
 * @date 2020/11/10 20:39
 * 代理汽车启动时间处理
 */
public class CarTimeProxy implements Movable {
    Movable movable;

    public CarTimeProxy(Movable movable){
        this.movable = movable;
    }
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("加速时:" + (endTime-startTime));
    }
}
