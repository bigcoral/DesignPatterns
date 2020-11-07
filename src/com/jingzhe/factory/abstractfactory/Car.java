package com.jingzhe.factory.abstractfactory;

/**
 * @author 惊蛰
 * @date 2020/11/7 20:55
 */
public class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car run!");
    }
}
