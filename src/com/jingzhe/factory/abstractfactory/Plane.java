package com.jingzhe.factory.abstractfactory;

/**
 * @author 惊蛰
 * @date 2020/11/7 20:56
 */
public class Plane extends Vehicle {
    @Override
    void run() {
        System.out.println("Plane fly!");
    }
}
