package com.jingzhe.proxy;

import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author 惊蛰
 * @date 2020/11/11 21:55
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank run run run!");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        //自动生成代理对象
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TankLogHandler(tank));

        movable.move();
    }
}
