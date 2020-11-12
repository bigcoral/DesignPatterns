package com.jingzhe.proxy;

import java.util.Random;

/**
 * @author 惊蛰
 * @date 2020/11/10 20:38
 */
public class Car implements Movable{
    @Override
    public void move() {
        System.out.println("Car run run run!");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CarLogProxy(new CarTimeProxy(new Car())).move();
    }
}



