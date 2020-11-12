package com.jingzhe.proxy.cglib;

import java.util.Random;

/**
 * @author 惊蛰
 * @date 2020/11/12 18:11
 */
public class Tank {

    public void move() {
        System.out.println("Tank run run run!");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
